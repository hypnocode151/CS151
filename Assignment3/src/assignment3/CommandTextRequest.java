package assignment3;

import java.util.Scanner;

/**
 * The CommandTextRequest reads the inputs from user then translates it to the
 * commands of the game.
 * @author Hypnocode
 */
public class CommandTextRequest extends CommandRequestor
{
    Scanner sc = new Scanner(System.in);
    String input = "";
    
    /*
     * Reads input from Player then makes a request based on the input.
     * @return a Command
     */
    @Override
    public Command requestCommand()
    {
        while (true)
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
                        return Command.THROWROCK;
                    case "p":
                        return Command.THROWPAPER;
                    case "s":
                        return Command.THROWSCISSORS;
                }
            }

            // Input is an option command or unrecognized.
            else 
            {
                if (input.equals("help")) 
                    return Command.HELP;
                else if (input.equals("score"))
                    return Command.SCORE;
                else if (input.equals("quit"))
                    return Command.QUIT;
                else 
                {
                    System.out.printf("Unrecognized command. Type 'help' for info.\n");
                }
            }
        }
    }
}
