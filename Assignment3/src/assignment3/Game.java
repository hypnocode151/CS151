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
    private static CalculatorType calculatorType;
    private static boolean GUI = true;
    private static RequestType requestType;
    
    /*
     * make a main menu with all the options
     */
    public static void MainMenu()
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("************************************");
        System.out.println("*    Rock Paper Scissors 2012      *");
        System.out.println("*            Hypnocode             *");
        System.out.println("************************************");
        System.out.println("\n\n\n\n\n");
        
        System.out.println("\033");
    }
    /*
     * Run the game.
     */
    public static void main(String[] args)
    {      
        if (GUI)
        {
            GameFrame.setupGUI();
            GameFrame.gameDisplay.setVisible(true);
            
            while (!GameFrame.gameDisplay.selectionMade())
            {
                Thread.yield();
            }
            
            GameFrame.gameDisplay.resetSelection();
            rounds = GameFrame.gameDisplay.getRounds();
            calculatorType = GameFrame.gameDisplay.getcalcType();
            requestType = RequestType.GUIREQUEST;
        }
        
        if (!GUI)
        {
            MainMenu();
            try
            {
                rounds = Integer.parseInt(args[0]);
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
            }
            catch (NumberFormatException expr)
            {
                System.out.println("Argument is not an integer.");
                System.out.println("Random Calculator selected");
                calcType = 0;
            }
            requestType = RequestType.TEXTREQUEST;
        }
        
        if (!GUI)
            aMatch = new Match(rounds, calcType, requestType);
        else
            aMatch = new Match(rounds, calculatorType, requestType);
        
        while(!aMatch.isMatchOver())
        {
            aMatch.makeThrows();
        }
        
        aMatch.declareWinner();
    }

}


