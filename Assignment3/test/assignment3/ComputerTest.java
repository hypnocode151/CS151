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
    CalculatorType type;
    
    /**
     * Test of makeThrow method, of class Computer.
     */
    @Test
    public void testRandomMakeThrow() 
    {
        type = CalculatorType.RANDOM;
         
        System.out.println("Test RandomMakeThrow");
        Computer comp = new Computer(name, type);
        
        comp.makeThrow(null);
        randomAssert(comp.getThrow());
        
        comp.makeThrow(null);
        randomAssert(comp.getThrow());
        
        comp.makeThrow(null);
        randomAssert(comp.getThrow());
        
    }
    
    private void randomAssert(Throw compThrow)
    {
        if (compThrow == Throw.ROCK)
            assertEquals(Throw.ROCK, compThrow);
        if (compThrow == Throw.PAPER)
            assertEquals(Throw.PAPER, compThrow);
        if (compThrow == Throw.SCISSORS)
            assertEquals(Throw.SCISSORS, compThrow);
    }
    
    @Test
    public void testSmartMakeThrow()
    {
        type = CalculatorType.SMART;
        System.out.println("Test SmartMakeThrow");
        Computer computer = new Computer(name, type);
        
        setupThrowHistorian(1);
        ThrowHistorian.reset();
        computer.makeThrow(null);
        assertEquals(Throw.ROCK, computer.getThrow());
        
        setupThrowHistorian(2);
        ThrowHistorian.reset();
        computer.makeThrow(null);
        assertEquals(Throw.SCISSORS, computer.getThrow());
        
        setupThrowHistorian(3);
        ThrowHistorian.reset();
        computer.makeThrow(null);
        assertEquals(Throw.PAPER, computer.getThrow());
        
        setupThrowHistorian(4);
        ThrowHistorian.reset();
        computer.makeThrow(null);
        assertEquals(Throw.SCISSORS, computer.getThrow());
        
        setupThrowHistorian(5);
        ThrowHistorian.reset();
        computer.makeThrow(null);
        
        // Algorithm conditions
        // Need a ThrowHistorian for each condition.
        // Case 1: If R > P && R >= S Choose R
        // Case 2: If R > P && R < S Choose S
        // Case 3: If P > R && P > S Choose P
        // Case 4: If P > R && P <= S Choose S
        // Case 5: Large Random List
    }
    
    private void setupThrowHistorian(int n)
    {
        Throw r = Throw.ROCK;
        Throw p = Throw.PAPER;
        Throw s = Throw.SCISSORS;
            
        switch (n)
        {
            case 1:
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, r);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, r);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, r);
                ThrowHistorian.recordThrows(s, s);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, r);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(s, s);
                ThrowHistorian.recordThrows(p, r);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, s);
                ThrowHistorian.recordThrows(p, s);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, r);
                ThrowHistorian.recordThrows(p, s);
                ThrowHistorian.recordThrows(r, s);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, r);
                ThrowHistorian.recordThrows(s, s);
                ThrowHistorian.recordThrows(p, r);
                ThrowHistorian.recordThrows(r, s);
                break;
                
        }
    }
}
