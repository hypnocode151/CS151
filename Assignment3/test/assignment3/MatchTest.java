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
        Match match  = new Match(1,0,RequestType.GUIREQUEST);
        boolean expResult = false;
        boolean result = match.isMatchOver();
        assertEquals(expResult, result);
        
        Match match2  = new Match(0,0,RequestType.GUIREQUEST);
        expResult = true;
        result = match2.isMatchOver();
        assertEquals(expResult, result);
        
        Match match3  = new Match(3,0,RequestType.TEXTREQUEST);
        expResult = false;
        result = match3.isMatchOver();
        assertEquals(expResult, result);
        
        Match match4  = new Match(0,1,RequestType.TEXTREQUEST);
        expResult = true;
        result = match4.isMatchOver();
        assertEquals(expResult, result);
        
        Match match5 =  new Match(0,CalculatorType.RANDOM,RequestType.GUIREQUEST);
        expResult = true;
        result = match5.isMatchOver();
        assertEquals(expResult, result);
        
        Match match6 =  new Match(3,CalculatorType.RANDOM,RequestType.TEXTREQUEST);
        expResult = false;
        result = match6.isMatchOver();
        assertEquals(expResult, result);
        
        Match match7 =  new Match(0,CalculatorType.SMART,RequestType.GUIREQUEST);
        expResult = true;
        result = match7.isMatchOver();
        assertEquals(expResult, result);
        
        Match match8 =  new Match(3,CalculatorType.SMART,RequestType.TEXTREQUEST);
        expResult = false;
        result = match8.isMatchOver();
        assertEquals(expResult, result);
        
        
        
        
        
    }
}
