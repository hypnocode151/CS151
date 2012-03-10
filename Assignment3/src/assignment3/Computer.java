package assignment3;
/**
 *
 * @author Tin
 */
public class Computer extends Player
{
    CalculatorType type = CalculatorType.RANDOM;
    
    public Computer ()
    {
        super();
    }
    
    @Override
    public void makeThrow()
    {
        ThrowCalculator calc = ThrowCalculator.makeCalculator(type);
        myThrow = calc.generateThrow();
    }
}
