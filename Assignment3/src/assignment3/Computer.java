
package assignment3;
/**
 *
 * @author Hypnocode
 */
public class Computer extends Player
{
    CalculatorType type;
        
    public Computer(String name, CalculatorType type)
    {
        super(name);
        this.type = type;
    }
    
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

