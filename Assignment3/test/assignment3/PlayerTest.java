package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class PlayerTest 
{
    private int score;
    protected Throw myThrow;
    private String name;
    
    /**
     * Test of compareThrows method, of class Player.
     */
    @Test
    public void testCompareThrows() 
    {
        System.out.println("Test compareThrows");
        Player player = new Player("test1");
        Player player2 = new Player("test2");
        player2.compareThrows(player);    
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() 
    {
        System.out.println("Test getScore");
        Player player1 =  new Player("test1");
        int expResult = score;
        int result = player1.getScore();
        assertEquals(expResult, result);    
    }

    /**
     * Test of incrementScore method, of class Player.
     */
    @Test
    public void testIncrementScore() 
    {
        System.out.println("Test incrementScore");
        Player player = new Player("test1");
        player.incrementScore();    
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() 
    {
        System.out.println("getName");
        Player player = new Player("name");
        String expResult = "name";
        String result = player.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getThrow method, of class Player.
     */
    @Test
    public void testGetThrow() 
    {
        System.out.println("Test getThrow");
        Player player = new Player("test");
        Throw expResult = myThrow;
        Throw result = player.getThrow();
        assertEquals(expResult, result);
    }

    /**
     * Test of makeThrow method, of class Player.
     */
    @Test
    public void testMakeThrow() 
    {
        System.out.println("Test makeThrow");
        Throw aThrow = myThrow;
        Player player = new Player("test1");
        player.makeThrow(aThrow);
    }
}
