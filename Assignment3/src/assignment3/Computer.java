package assignment3;
/**
 *
 * @author D4rkFr4g
 */
public class Computer extends Player
{
    
    public Computer ()
    {
        super();
    }
    
    public void makeThrow()
    {
        super.myThrow = ThrowRandom.generateThrow();
    }
}
