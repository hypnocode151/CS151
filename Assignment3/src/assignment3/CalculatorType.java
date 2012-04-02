package assignment3;

/**
 *
 * @author Hypnocode
 * The CalculatorType loop up type for which Algorithm the computer would use
 * @param int the value to pass into the method
 */
public enum CalculatorType 
{
    RANDOM;

    public static CalculatorType lookUpType(int i)
    {
        return CalculatorType.values()[i];
    }
}
