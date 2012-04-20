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
        Match match  = new Match(3,1,RequestType.GUIREQUEST);
        boolean expResult = true;
        boolean result = match.isMatchOver();
        assertEquals(expResult, result);
        
        
        
        
        
    }
}
