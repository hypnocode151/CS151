package assignment3;

/**
*
* @author Hypnocode
*/
public abstract class CommandRequestor
{
    public static CommandRequestor makeRequestor(RequestType type)
    {
        switch (type)
        {
            case TEXTREQUEST:
                return new CommandTextRequest();
        }
        return null;
    }
    
    public abstract Command requestCommand();
}
