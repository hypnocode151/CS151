package assignment3;

/**
*
* @author D4rkFr4g
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
    
    public abstract Throw generateThrow();
}