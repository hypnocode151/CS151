
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Hypnocode
 */
public abstract class ThrowCalculator 
{
    public static ThrowCalculator makeCalculator(CalculatorType type)
    {
        switch (type)
        {
            case RANDOM: 
                return new ThrowRandom();         
        }
        return null;
    }
    
    public abstract Throw generateThrow();        
}
  
