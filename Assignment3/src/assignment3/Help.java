package assignment3;

/**
 * 
 * End-user information on how to interact with the application.
 * @author Hypnocode
 * 
 */
public class Help
{
    /*
     * Prints to a command line information on how to input choices
     */
    public static void displayHelp()
    {
        System.out.printf("\nCmds:\n"
            + "%10s - throw rock, paper, or scissors\n"
            + "%10s - display this help message\n"
            + "%10s - display the current score\n"
            + "%10s - count the throws so far and the limit\n"
            + "%10s - quit this program"
            + "\n"
            , "r/p/s", "help", "score", "count", "quit");
    }
}