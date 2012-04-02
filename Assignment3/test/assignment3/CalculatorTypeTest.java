/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;

/**
 *
 * @author ttran
 */
public class CalculatorTypeTest {
    
    public CalculatorTypeTest() {
    }

      
   /**
     * Test of lookUpType method, of class CalculatorType.
     */
    @Test
    public void testLookUpType() {
        System.out.println("Test LoopupType()");
        int i = 0;
        CalculatorType expResult = null;
        CalculatorType result = CalculatorType.lookUpType(i);
        assertEquals(expResult, result);
    
    }
}
