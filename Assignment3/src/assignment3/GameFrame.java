package assignment3;

/**
 *
 * @author HypnoCode
 */
public class GameFrame 
{
    public static GameDisplay gameDisplay;
    private static boolean GUI = false;
    
    public static void setupGUI()
    {
        gameDisplay = new GameDisplay();
        GUI = true;
    }
    
    public static boolean isGUI()
    {
        return GUI;
    }
}
