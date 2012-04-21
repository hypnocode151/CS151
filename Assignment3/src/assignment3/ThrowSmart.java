package assignment3;

import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * Extension of ThrowCalculator class that makes a decision using information
 * from the ThrowHistorian regarding the past throw sequences.
 * @author Hypnocode
 * 
 */
public class ThrowSmart extends ThrowCalculator
{

    /**
     * Generate a throw based on history or randomly picked if it is empty.
     * @return a smart or random throw
     */
    @Override
    public Throw generateThrow() 
    {
        ArrayList<Throw> throwList;
        int rockSequence = 0;
        int paperSequence = 0;
        int scissorsSequence = 0;
        
        // N == 3 Algorithm
        int n = 3;
        throwList = ThrowHistorian.getLastSequence(n);
        
        if (!throwList.isEmpty())
        {
            // Check for Sequence + Rock
            throwList.add(Throw.ROCK);
            rockSequence = ThrowHistorian.searchSequence(throwList);
            throwList.remove(throwList.size() - 1);

            // Check for Sequence + Paper
            throwList.add(Throw.PAPER);
            paperSequence = ThrowHistorian.searchSequence(throwList);
            throwList.remove(throwList.size() - 1);

            // Check for Sequence + Scissors
            throwList.add(Throw.SCISSORS);
            scissorsSequence = ThrowHistorian.searchSequence(throwList);
            throwList.remove(throwList.size() - 1);

            if (rockSequence > scissorsSequence && rockSequence >= paperSequence)
                return Throw.PAPER;
            else if (paperSequence > rockSequence && paperSequence >= scissorsSequence)
                return Throw.SCISSORS;
            else if (scissorsSequence > paperSequence && scissorsSequence >= rockSequence)
                return Throw.ROCK;
            else
                return randomThrow();
        }
        else
        {
            return randomThrow();
        }
    }
    
    /**
     * Returns a random throw.
     * @return a random throw
     */
    private Throw randomThrow()
    {
        Random rand = new Random();
        Throw myThrow = null;

        switch (rand.nextInt(3))
        {
            case 0: myThrow = Throw.ROCK;
                break;
            case 1: myThrow = Throw.PAPER;
                break;
            case 2: myThrow = Throw.SCISSORS;
                break;
        }

        return myThrow;
    }
    
}
