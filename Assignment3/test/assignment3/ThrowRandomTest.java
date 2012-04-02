/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class ThrowRandomTest {
    protected Throw ROCK;
    protected Throw PAPER;
    protected Throw SCISSORS;
    protected Throw NULL;
    public ThrowRandomTest() {
    }


    /**
     * Test of generateThrow method, of class ThrowRandom.
     */
    @Test
    public void testGenerateThrow() {
        System.out.println("generateThrow");
        ThrowRandom athrow = new ThrowRandom();
        Throw expResult = ROCK;
        Throw expResult2 = PAPER;
        Throw expResult3 = SCISSORS;
        Throw result = athrow.generateThrow();
        assertEquals(expResult, result);
        assertEquals(expResult2, result);
        assertEquals(expResult3, result);
    }
}
