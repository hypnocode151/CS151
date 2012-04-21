package assignment3;

/**
 * 
 * Displays a list of options for the user to choose from and translates it
 * to the commands of the game.
 * @author HypnoCode
 * 
 */
public class CommandGUIRequest extends CommandRequestor
{
    /*
     * Reads input from Player then makes a request based on the input.
     * @return Command
     */
    @Override
    public Command requestCommand() 
    {
        while (!GameFrame.gameDisplay.selectionMade())
        {
            //System.out.println();
            Thread.yield();
        }
        
        Command command = GameFrame.gameDisplay.getSelection();
        GameFrame.gameDisplay.resetSelection();
        return command;
    }
}
