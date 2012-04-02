
package assignment3;
/**
 *
 * @author Hypnocode
 * The Computer class extends Player constructs a computer and makes throw.
 */
public class Computer extends Player
{
    CalculatorType type;
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
     * Makes a throw.
     * @param Throw the throw of the computer.
     */
    @Override
    public void makeThrow(Throw aThrow)
    {
        ThrowCalculator calc = ThrowCalculator.makeCalculator(type);
        myThrow = calc.generateThrow();
    }
/*    
    @Override
    public void setThrow(Throw aThrow)
    {
        //Empty method to prevent computer setting of myThrow.
    }
    
*/
}

