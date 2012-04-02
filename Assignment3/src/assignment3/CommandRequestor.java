package assignment3;

/**
*
* @author Hypnocode
* a CommendRequestor is a class that handles all the command requests
*/
public abstract class CommandRequestor
{
    /*
     * Make a new command text requestor
     * @param RequestType the type of command to be passed in
     * @return a CommandRequestor
     */
    public static CommandRequestor makeRequestor(RequestType type)
    {
        switch (type)
        {
            case TEXTREQUEST:
                return new CommandTextRequest();
        }
        return null;
    }
    /*
     * request new command
     */
    public abstract Command requestCommand();
}
