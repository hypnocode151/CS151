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
public class CommandTextRequest 
{
    Scanner sc = new Scanner(System.in);
    String input = "";
    
    Command generateThrow()
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
                    return THROWROCK;
                    break;
                case "p":
                    return THROWPAPER;
                    break;
                case "s":
                    return THROWSCISSORS;
                    break;
            }
        }
            
        // Input is an option command or unrecognized.
        else 
        {
            if (input.equals("help")) 
                return HELP;
            else 
            {
                System.out.printf("Unrecognized command. Type 'help' for info.\n");
            }
        }
        
        
        return null;
    }
}
