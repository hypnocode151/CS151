package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
<<<<<<< HEAD
public class ThrowRandomTest {
    protected Throw ROCK;
    protected Throw PAPER;
    protected Throw SCISSORS;
    protected Throw NULL;
    public ThrowRandomTest() {
    }


=======
public class ThrowRandomTest 
{
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    /**
     * Test of generateThrow method, of class ThrowRandom.
     */
    @Test
    public void testGenerateThrow() 
    {
        System.out.println("generateThrow");
        ThrowRandom athrow = new ThrowRandom();
        Throw expResult = ROCK;
        Throw expResult2 = PAPER;
        Throw expResult3 = SCISSORS;
        Throw result = athrow.generateThrow();
<<<<<<< HEAD
        assertEquals(expResult, result);
        assertEquals(expResult2, result);
        assertEquals(expResult3, result);
=======
        assertEquals(expResult, result);    
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }
}
