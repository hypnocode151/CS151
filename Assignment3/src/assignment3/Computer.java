
package assignment3;
/**
 *
 * @author Hypnocode
 * The Computer class extends Player constructs a computer and makes throw.
 */
public class Computer extends Player
{
    private CalculatorType type;
      /*
       * Creates a new Computer.
       * @param String the name of the Computer.
       * @param CalculatorType the type of the computer.
       */
    public Computer(String name, CalculatorType type)
    {
        super(name);
        this.type = type;
    }
    /*
     * makes a throw
     * @param aThrow Unused and null for computer
     */
    @Override
    public void makeThrow(Throw aThrow)
    {
        aThrow = null;
        ThrowCalculator calc = ThrowCalculator.makeCalculator(type);
        myThrow = calc.generateThrow();
    }
}

