package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class PlayerTest 
{   
    /**
     * Test of compareThrows method, of class Player.
     */
    @Test
    public void testCompareThrows() 
    {
        System.out.println("Test compareThrows");
        Player player = new Human("test1");
        Player player2 = new Human("test2");

        int score1 = player.getScore();
        int score2 = player2.getScore();
        player.makeThrow(Throw.ROCK);
        player2.makeThrow(Throw.PAPER);
        player2.compareThrows(player);
        assertEquals(score1,player.getScore());
        assertEquals(score2+1, player2.getScore());
        
        score1 = player.getScore();
        score2 = player2.getScore();
        player.makeThrow(Throw.ROCK);
        player2.makeThrow(Throw.SCISSORS);
        player2.compareThrows(player);
        assertEquals(score1+1,player.getScore());
        assertEquals(score2, player2.getScore());
        
        score1 = player.getScore();
        score2 = player2.getScore();
        player.makeThrow(Throw.PAPER);
        player2.makeThrow(Throw.SCISSORS);
        player2.compareThrows(player);
        assertEquals(score1,player.getScore());
        assertEquals(score2+1, player2.getScore());
        
        score1 = player.getScore();
        score2 = player2.getScore();
        player.makeThrow(Throw.PAPER);
        player2.makeThrow(Throw.ROCK);
        player2.compareThrows(player);
        assertEquals(score1+1,player.getScore());
        assertEquals(score2, player2.getScore());
        
       
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

        int currentscore = player.getScore();
        player.incrementScore();
        player.incrementScore();
        player.incrementScore();
        assertEquals(player.getScore(),currentscore+3);

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
        Player player = new Human("test");
        Throw expResult = Throw.ROCK;
        player.makeThrow(Throw.ROCK);
        Throw result = player.getThrow();
        assertEquals(expResult, result);

        
        Throw expResult2 = Throw.PAPER;
        player.makeThrow(Throw.PAPER);
        Throw result2 = player.getThrow();
        assertEquals(expResult2, result2);
        
        Throw expResult3 = Throw.PAPER;
        player.makeThrow(Throw.PAPER);
        Throw result3 = player.getThrow();
        assertEquals(expResult3, result3);

    }

    /**
     * Test of makeThrow method, of class Player.
     */
    @Test
    public void testMakeThrow() 
    {
        System.out.println("Test makeThrow");
        Player player = new Human("test");
        Throw expResult = Throw.ROCK;
        player.makeThrow(Throw.ROCK);
        Throw result = player.getThrow();
        assertEquals(expResult, result);

        
        Throw expResult2 = Throw.PAPER;
        player.makeThrow(Throw.PAPER);
        Throw result2 = player.getThrow();
        assertEquals(expResult2, result2);
        
        Throw expResult3 = Throw.PAPER;
        player.makeThrow(Throw.PAPER);
        Throw result3 = player.getThrow();
        assertEquals(expResult3, result3);

    }
}
