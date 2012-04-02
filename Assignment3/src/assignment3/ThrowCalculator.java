package assignment3;

/**
 *
 * @author Hypnocode
 * The ThrowCalculator Class constructs a throw calculator based 
 * on the calculator type.
 */
public abstract class ThrowCalculator 
{
    public static ThrowCalculator makeCalculator(CalculatorType type)
    {
        switch (type)
        {
            case RANDOM: 
                return new ThrowRandom();         
        }
        return null;
    }
    /*
     * 
     */
    public abstract Throw generateThrow();        
}
  
