package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
<<<<<<< HEAD
public class MatchTest {
    private int score;
    protected Throw ROCK;
    protected Throw PAPER;
    protected Throw SCISSORS;
    protected Throw NULL;
    private String name;
    public MatchTest() {
    }

  
=======
public class MatchTest 
{
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    /**
     * Test of makeThrows method, of class Match.
     */
    @Test
    public void testMakeThrows() 
    {
        System.out.println("Test makeThrows");
        Match match = new Match(1,1);
<<<<<<< HEAD
        match.makeThrows();
        Match match2 = new Match(2,1);
        match2.makeThrows();
        match2.makeThrows();
        
=======
        match.makeThrows();    
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }

    /**
     * Test of declareWinner method, of class Match.
     */
    @Test
    public void testDeclareWinner() 
    {
        System.out.println("Test declareWinner");
        Match match = new Match(1,1);
        match.declareWinner();
    }

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
    }
}
