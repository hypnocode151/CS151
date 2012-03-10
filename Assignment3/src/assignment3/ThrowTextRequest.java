/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Zane Melcho, Bao
 */
public class ThrowTextRequest 
{
    Scanner sc = new Scanner(System.in);
    String input = "";
    
    Throw generateThrow()
    {
        System.out.printf("Let's play!\n"
        + "Enter 'help' for options.\n"
        + "To throw, enter 'r' for rock, 'p' for paper, or 's' for scissors.\n");
                   
        input = sc.next().toLowerCase();
            
        // Input is a throw.
        if (input.equals("r") || input.equals("p") || input.equals("s")) 
        {
            switch (input) 
            {
                case "r":
                    human.makeThrow(Throw.Sign.ROCK);
                    break;
                case "p":
                    human.makeThrow(Throw.Sign.PAPER);
                    break;
                case "s":
                    human.makeThrow(Throw.Sign.SCISSORS);
                    break;
            }
        }
            
        // Input is an option command or unrecognized.
        else 
        {
            if (input.equals("help")) 
                Help.displayHelp();
            else 
            {
                System.out.printf("Unrecognized command. Type 'help' for info.\n");
            }
        }
        
        
        return null;
    }
}
