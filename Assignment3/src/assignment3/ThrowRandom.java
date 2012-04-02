
package assignment3;
import java.util.Random;
/**
 *
 * @author Hypnocode
 * 
 */
public class ThrowRandom extends ThrowCalculator 
{
    private Random rand = new Random();
   
    public Throw generateThrow()
    {
        switch(randomthrow(1,3))
        {
            case 1: return Throw.ROCK;
            case 2: return Throw.PAPER;
            case 3: return Throw.SCISSORS;
           
        }
        return Throw.NULL;
    }
    
    
    public int randomthrow(int min, int max)
    {
        if(min>max)
        {return -1;}
        return rand.nextInt(max-min+1) + min;
    }
}
