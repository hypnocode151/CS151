package assignment3;

/**
*
* @author Zane Melcho
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
    
    public abstract Command generateCommand();
}