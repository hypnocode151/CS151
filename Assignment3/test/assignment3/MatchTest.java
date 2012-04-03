package assignment3;

import java.io.InputStream;
import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayInputStream;

/**
 *
 * @author Hypnocode
 */
public class MatchTest 
{
    /**
     * Test of isMatchOver method, of class Match.
     */
    @Test
    public void testIsMatchOver()
    {
        System.out.println("Test isMatchOver");
        Match match  = new Match(1,1);
        boolean expResult = false;
        boolean result = match.isMatchOver();
        assertEquals(expResult, result);
        
        match = new Match(0,1);
        expResult = true;
        result = match.isMatchOver();
        assertEquals(expResult, result);
    }
}
