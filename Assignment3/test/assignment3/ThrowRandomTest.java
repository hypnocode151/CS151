package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hypnocode
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
        Throw expResult = Throw.ROCK;
        Throw expResult2 = Throw.PAPER;
        Throw expResult3 = Throw.SCISSORS;
        Throw result = athrow.generateThrow();

        if(result == Throw.ROCK){
        assertEquals(expResult, result);}
        if (result == Throw.PAPER){
        assertEquals(expResult2, result);}
        if (result == Throw.SCISSORS){
        assertEquals(expResult3, result);}

    }
}
