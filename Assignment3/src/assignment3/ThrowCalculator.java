
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author D4rkFr4g
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
>>>>>>> f33153a74d2ab0ddd91446133afd072bbeb5a73a
