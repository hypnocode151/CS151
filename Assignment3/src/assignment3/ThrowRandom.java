package assignment3;

import java.util.Random;

/**
 * ThrowRandom is an extension of the ThrowCalculator class that picks a random
 * throw choice for the player.
 * @author Hypnocode
 * 
 */
public class ThrowRandom extends ThrowCalculator 
{
    private Random rand = new Random();
   
    /*
     * Returns a random throw.
     * @return Throw The throw picked
     */
    public Throw generateThrow()
    {
        switch (randomthrow(1,3))
        {
            case 1: return Throw.ROCK;
            case 2: return Throw.PAPER;
            case 3: return Throw.SCISSORS;
        }
        return Throw.NULL;
    }
    
    /*
     * Internal method that picks a random number between min and max.
     * @param min Lowest integer to choose from
     * @param max Largest integer to choose from
     */
    private int randomthrow(int min, int max)
    {
        if (min > max)
            return -1;
        
        return rand.nextInt(max-min+1) + min;
    }
}
