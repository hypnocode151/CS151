package assignment3;

/**
 *
 * Overhead frame for the GUI.
 * @author HypnoCode
 * 
 */
public class GameFrame 
{
    public static GameDisplay gameDisplay;
    
    /**
     * Setup the GUI.
     */
    public static void setupGUI()
    {
        gameDisplay = new GameDisplay();
    }
}
