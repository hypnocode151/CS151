package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class ThrowRandomTest 
{
    /**
     * Test of generateThrow method, of class ThrowRandom.
     */
    @Test
    public void testGenerateThrow() 
    {
        System.out.println("generateThrow");
        ThrowRandom athrow = new ThrowRandom();
        Throw expResult = null;
        Throw result = athrow.generateThrow();
        assertEquals(expResult, result);    
    }
}
