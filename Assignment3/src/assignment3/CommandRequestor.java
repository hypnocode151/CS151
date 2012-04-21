package assignment3;

/**
 * 
 * The CommendRequestor is a class that handles all the command requests.
 * @author Hypnocode
 * 
 */
public abstract class CommandRequestor
{
    /*
     * Makes a new command text requestor.
     * @param RequestType the type of command to be passed in
     * @return a CommandRequestor
     */
    public static CommandRequestor makeRequestor(RequestType type)
    {
        switch (type)
        {
            case TEXTREQUEST:
                return new CommandTextRequest();
            case GUIREQUEST:
                return new CommandGUIRequest();
        }
        return null;
    }

    /*
     * Request new command.
     */
    public abstract Command requestCommand();
}
