
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
<<<<<<< HEAD
     * Makes a throw.
     * @param Throw the throw of the computer.
=======
     * makes a throw
     * @param aThrow Unused and null for computer
>>>>>>> 76b15c33c1f622f444aa53a8786cc94390cb74dc
     */
    @Override
    public void makeThrow(Throw aThrow)
    {
        aThrow = null;
        ThrowCalculator calc = ThrowCalculator.makeCalculator(type);
        myThrow = calc.generateThrow();
    }
}

