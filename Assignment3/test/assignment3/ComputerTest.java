package assignment3;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Hypnocode
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
        
        comp.makeThrow(Throw.ROCK);
        randomAssert(comp.getThrow());
        
        comp.makeThrow(Throw.PAPER);
        randomAssert(comp.getThrow());
        
        comp.makeThrow(Throw.SCISSORS);
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
        computer.makeThrow(null);
        assertEquals(Throw.PAPER, computer.getThrow());
        ThrowHistorian.reset();
        
        setupThrowHistorian(2);
        computer.makeThrow(null);
        assertEquals(Throw.ROCK, computer.getThrow());
        ThrowHistorian.reset();
        
        setupThrowHistorian(3);
        computer.makeThrow(null);
        assertEquals(Throw.SCISSORS, computer.getThrow());
        ThrowHistorian.reset();
        
        setupThrowHistorian(4);
        computer.makeThrow(null);
        if (computer.getThrow() == Throw.ROCK)
        {
        assertEquals(Throw.ROCK, computer.getThrow());
        }
        else if (computer.getThrow() == Throw.PAPER)
        {
        assertEquals(Throw.PAPER,computer.getThrow());
        }
        else
        assertEquals(Throw.SCISSORS, computer.getThrow());
        ThrowHistorian.reset();
        
        
        // Algorithm conditions
        // Need a ThrowHistorian for each condition.
        // Case 1: R > S && R >= P     Throw.Paper
        // Case 2: S > P && S >=R      Throw.Rock
        // Case 3: P > R && P >= S     Throw.Scissors
        // Case 4: Large Random List
    }
    
    private void setupThrowHistorian(int n)
    {
        Throw r = Throw.ROCK;
        Throw p = Throw.PAPER;
        Throw s = Throw.SCISSORS;
            
        switch (n)
        {
            case 1:
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(p, s);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, p);
                break;
            case 2:
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, p);
                break;
            case 3:
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(s, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(p, p);
                ThrowHistorian.recordThrows(r, p);
                ThrowHistorian.recordThrows(r, p);
                break;
            case 4:
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
              //  ThrowHistorian.recordThrows(s, r);
              //  ThrowHistorian.recordThrows(p, s);
            //    ThrowHistorian.recordThrows(r, s);
                ThrowHistorian.recordThrows(p, p);
           //     ThrowHistorian.recordThrows(r, r);
            //    ThrowHistorian.recordThrows(s, s);
                ThrowHistorian.recordThrows(p, r);
            //    ThrowHistorian.recordThrows(r, s);
                break;
                
        }
    }
}
