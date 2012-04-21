package assignment3;

/**
 * 
 * Looks up the type for which algorithm the computer would use.
 * @author Hypnocode
 * 
 */
public enum CalculatorType 
{
    RANDOM,SMART;

    /**
     * Looks up computer's current throw algorithm.
     * @param i the type index
     * @return the algorithm
     */
    public static CalculatorType lookUpType(int i)
    {
        return CalculatorType.values()[i];
    }
}
