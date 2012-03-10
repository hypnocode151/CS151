
package assignment3;
/**
 *
 * @author Hypnocode
 */
public class Computer extends Player
{
    CalculatorType type = CalculatorType.RANDOM;
    
    public Computer ()
    {
        super();
    }
    
    public void makeThrow()
    {
        ThrowCalculator calc = ThrowCalculator.makeCalculator(type);
        myThrow = calc.generateThrow();
    }
}

