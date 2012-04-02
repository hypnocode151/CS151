package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ttran
 */
public class MatchTest 
{
    /**
     * Test of makeThrows method, of class Match.
     */
    @Test
    public void testMakeThrows() 
    {
        System.out.println("Test makeThrows");
        Match match = new Match(1,1);
        match.makeThrows();
        Match match2 = new Match(2,1);
        match2.makeThrows();
    }

    /**
     * Test of declareWinner method, of class Match.
     */
    @Test
    public void testDeclareWinner() 
    {
        System.out.println("Test declareWinner");
        Match match = new Match(3,1);
        Player human = new Human("human");
        Player computer = new Computer("comp",CalculatorType.RANDOM);
        human.makeThrow(Throw.ROCK);
        computer.makeThrow(Throw.ROCK);
        computer.compareThrows(human);
        int score1 = computer.getScore();
        int score2 = human.getScore();
        
        human.makeThrow(Throw.PAPER);
        computer.makeThrow(Throw.ROCK);
        human.incrementScore();
        score1 = computer.getScore();
        score2 = human.getScore();
        
        human.makeThrow(Throw.SCISSORS);
        computer.makeThrow(Throw.ROCK);
        computer.incrementScore();
        score1 = computer.getScore();
        score2 = human.getScore();
        
       human.makeThrow(Throw.SCISSORS);
        computer.makeThrow(Throw.PAPER);
        human.incrementScore();
        score1 = computer.getScore();
        score2 = human.getScore();
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
