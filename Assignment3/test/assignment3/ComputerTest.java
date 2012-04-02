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
    public void testMakeThrow() 
    {
        System.out.println("Test makeThrow");
        Computer comp = new Computer(name, type);
        comp.makeThrow(Throw.ROCK);
        comp.makeThrow(Throw.PAPER);
        comp.makeThrow(Throw.SCISSORS);
    }
}
