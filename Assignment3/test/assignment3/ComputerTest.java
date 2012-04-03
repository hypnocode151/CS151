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
public class ComputerTest 
{
    String name;
    CalculatorType type = CalculatorType.RANDOM;

    /**
     * Test of makeThrow method, of class Computer.
     */
    @Test
    public void testMakeThrow() 
    {
        System.out.println("Test makeThrow");
        Computer comp = new Computer(name, type);
        
        comp.makeThrow(null);
        runAssert(comp.getThrow());
        
        comp.makeThrow(null);
        runAssert(comp.getThrow());
        
        comp.makeThrow(null);
        runAssert(comp.getThrow());
        
    }
    
    private void runAssert(Throw compThrow)
    {
        if (compThrow == Throw.ROCK)
            assertEquals(Throw.ROCK, compThrow);
        if (compThrow == Throw.PAPER)
            assertEquals(Throw.PAPER, compThrow);
        if (compThrow == Throw.SCISSORS)
            assertEquals(Throw.SCISSORS, compThrow);
    }
}
