package assignment3;

import org.junit.Test;
import org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class CalculatorTypeTest 
{
    
    public CalculatorTypeTest() 
    {
    }
 
   /**
     * Test of lookUpType method, of class CalculatorType.
     */
    @Test
    public void testLookUpType() 
    {
        System.out.println("Test LoopupType()");
        int i = 0;
        CalculatorType expResult = null;
        CalculatorType result = CalculatorType.lookUpType(i);
        assertEquals(expResult, result);
    }
}
