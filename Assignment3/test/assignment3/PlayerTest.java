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
    protected Throw ROCK;
    protected Throw PAPER;
    protected Throw SCISSORS;
    protected Throw NULL;
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
<<<<<<< HEAD
        player.makeThrow(ROCK);
        player2.makeThrow(PAPER);
        player2.compareThrows(player);
        
        player.makeThrow(ROCK);
        player2.makeThrow(SCISSORS);
        player2.compareThrows(player);
        
        player.makeThrow(PAPER);
        player2.makeThrow(SCISSORS);
        player2.compareThrows(player);
        
=======
        player2.compareThrows(player);    
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }

    /**
     * Test of getScore method, of class Player.
     */
    @Test
    public void testGetScore() 
    {
        System.out.println("Test getScore");
        Player player1 =  new Player("test1");
        player1.incrementScore();
        player1.incrementScore();
        player1.incrementScore();
        int expResult = 3;
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
<<<<<<< HEAD
        int currentscore = player.getScore();
        player.incrementScore();
        player.incrementScore();
        player.incrementScore();
        assertEquals(player.getScore(),currentscore+3);
        
=======
        player.incrementScore();    
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() 
    {
        System.out.println("getName");
        Player player = new Player(name);
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
        Throw expResult = ROCK;
        player.makeThrow(ROCK);
        Throw result = player.getThrow();
        assertEquals(expResult, result);
<<<<<<< HEAD
        
        Throw expResult2 = PAPER;
        player.makeThrow(PAPER);
        Throw result2 = player.getThrow();
        assertEquals(expResult2, result2);
        
        Throw expResult3 = PAPER;
        player.makeThrow(PAPER);
        Throw result3 = player.getThrow();
        assertEquals(expResult3, result3);
=======
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }

    /**
     * Test of makeThrow method, of class Player.
     */
    @Test
    public void testMakeThrow() 
    {
        System.out.println("Test makeThrow");
        Player player = new Player("test1");
<<<<<<< HEAD
        player.makeThrow(ROCK);
        player.makeThrow(PAPER);
        player.makeThrow(SCISSORS);
   
=======
        player.makeThrow(aThrow);
>>>>>>> 019066683e50eb602b6ff7b1acf290a89516fbd9
    }
}
