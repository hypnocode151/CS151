package assignment3;

import java.util.Scanner;

/**
 *
 * Executable class that creates a match and calls other methods for a match.
 * @author Hypnocode
 * 
 */
public class Game
{
    
    private static Match aMatch;
    private static int rounds = 0;
    private static int calcType;
    private static CalculatorType calculatorType;
    
    // Please assign interfaceType to the interface you want to use.
    private static InterfaceType interfaceType = InterfaceType.GUINTERFACE;
    /**
     * Returns the interface that is being used.
     * @return interfaceType this is the interface type
     */
    public static InterfaceType getInterfaceType()
    {
        return interfaceType;
    }
    
    /*
     * Makes a main menu with all the options, for text interface.
     * Assumes the round limit and algorithm number is specified.
     * Example: java Game 10 1
     */
    public static void MainMenu()
    {
        
        System.out.println("************************************");
        System.out.println("*    Rock Paper Scissors 2012      *");
        System.out.println("*            Hypnocode             *");
        System.out.println("************************************");
        System.out.println("\n\n\n\n\n");
        
        System.out.println("\033");
    }

    /*
     * Main method to run the game.
     */
    public static void main(String[] args)
    {
        // Set up the game according to the interface.
        switch (interfaceType)
        {
            
            case GUINTERFACE: 
                GameFrame.setupGUI();
                GameFrame.gameDisplay.setVisible(true);

                while (!GameFrame.gameDisplay.selectionMade())
                {
                    Thread.yield();
                }

                GameFrame.gameDisplay.resetSelection();
                rounds = GameFrame.gameDisplay.getRounds();
                calculatorType = GameFrame.gameDisplay.getcalcType();
                
                aMatch = new Match(rounds, calculatorType, RequestType.GUIREQUEST);
                break;
                
            case TEXTINTERFACE:
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
                
                aMatch = new Match(rounds, calcType, RequestType.TEXTREQUEST);
                break;
        }
        
        // Gameplay loop.
        while(!aMatch.isMatchOver())
        {
            aMatch.makeThrows();
        }
        
        aMatch.declareWinner();
    }

}


