package assignment3;

import java.util.Scanner;

/**
*
* @author Hypnocode
* The Game Class creates a match and calls other methods for a match to run.
* 
*/
public class Game
{
    
    private static Match aMatch;
    private static int rounds = 0;
    private static int calcType;
    private static GameDisplay gameDisplay;
    private static boolean GUI = true;
    /*
     * make a main menu with all the options
     */
    public static void MainMenu()
    {
        Scanner scan = new Scanner(System.in);
        
        //Display logo and prompt for number of throws
        System.out.println("************************************");
        System.out.println("*    Rock Paper Scissors 2012      *");
        System.out.println("*            Hypnocode             *");
        System.out.println("************************************");
        System.out.println("\n\n\n\n\n");
        //System.out.println("Please enter the number of throws");
        //rounds = scan.nextInt();
        
        System.out.println("\033");
    }
    /*
     * Run the game.
     */
    public static void main(String[] args)
    {
        gameDisplay = new GameDisplay();
        gameDisplay.setVisible(true);
        
        if (!GUI)
        {
            MainMenu();

            try
            {
                rounds = Integer.parseInt(args[0]);
                //System.out.println(rounds + " = rounds");
            }
            catch (NumberFormatException expr)
            {
                System.out.println("Argument is not an integer.");
                System.out.println("One round selected.");
                rounds = 1;
            }

            try
            {
                calcType = Integer.parseInt(args[1]);
                //System.out.println(calcType + " = calcType");
            }
            catch (NumberFormatException expr)
            {
                System.out.println("Argument is not an integer.");
                System.out.println("Random Calculator selected");
                calcType = 0;
            }
        }
        
        aMatch = new Match(rounds, calcType);
        
        while(!aMatch.isMatchOver())
        {
            aMatch.makeThrows();
        }
        
        aMatch.declareWinner();
    }

}

