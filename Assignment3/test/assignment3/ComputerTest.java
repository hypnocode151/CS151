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
public class ComputerTest {
protected Throw ROCK;
protected Throw PAPER;
protected Throw SCISSORS;
protected Throw NULL;
String name;
CalculatorType type;
    public ComputerTest() {
    }

  
    /**
     * Test of makeThrow method, of class Computer.
     */
    @Test
    public void testMakeThrow() {
        System.out.println("Test makeThrow");
        Computer comp = new Computer(name, type);
        comp.makeThrow(ROCK);
        comp.makeThrow(PAPER);
        comp.makeThrow(SCISSORS);
    }
}
