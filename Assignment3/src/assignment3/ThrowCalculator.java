package assignment3;

/**
 *
 * Constructs a throw calculator based on the calculator type.
 * @author Hypnocode
 * 
 */
public abstract class ThrowCalculator 
{
    public static ThrowCalculator makeCalculator(CalculatorType type)
    {
        switch (type)
        {
            case RANDOM: return new ThrowRandom();
            case SMART: return new ThrowSmart();
        }
        return null;
    }

    public abstract Throw generateThrow();        
}
