package assignment3;

/**
 *The CalculatorType looks up type for which algorithm the computer would use.
 * @param int the value to pass into the method.
 * @author Hypnocode
 * 
 */
public enum CalculatorType 
{
    RANDOM,SMART;

    public static CalculatorType lookUpType(int i)
    {
        return CalculatorType.values()[i];
    }
}
