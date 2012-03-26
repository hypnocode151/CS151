package assignment3;

/**
 *
 * @author Zane Melcho
 */
public enum CalculatorType 
{
    RANDOM;

    public static CalculatorType lookUpType(int i)
    {
        return CalculatorType.values()[i];
    }
}
