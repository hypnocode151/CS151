/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author ttran
 */
public class MatchTest {
    
    public MatchTest() {
    }

  
    /**
     * Test of makeThrows method, of class Match.
     */
    @Test
    public void testMakeThrows() {
        System.out.println("Test makeThrows");
        Match match = new Match(1,1);
        match.makeThrows();
        
    }

    /**
     * Test of declareWinner method, of class Match.
     */
    @Test
    public void testDeclareWinner() {
        System.out.println("Test declareWinner");
        Match match = new Match(1,1);
        match.declareWinner();
    }

    /**
     * Test of isMatchOver method, of class Match.
     */
    @Test
    public void testIsMatchOver() {
        System.out.println("Test isMatchOver");
        Match match  = new Match(1,1);
        boolean expResult = false;
        boolean result = match.isMatchOver();
        assertEquals(expResult, result);
        
    }
}