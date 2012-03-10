package assignment3;
/**
*
* @author ttran
*/
public class Match
{
    private Player human = new Human();
    private Player computer = new Computer();
    private int round;
    RequestType type = RequestType.TEXTREQUEST;
    
    public Match(int round)
    {
        this.round = round;
    }
    
    
    public void makeThrows()
    {
        CommandRequestor cr = CommandRequestor.makeRequestor(type);
        
        switch (cr.generateCommand())
        {
            case THROWROCK:
                human.setThrow(Throw.ROCK);
                break;
            case THROWPAPER:
                human.setThrow(Throw.PAPER);
                break;
            case THROWSCISSORS:
                human.setThrow(Throw.SCISSORS);
                break;
            case HELP:
                Help.displayHelp();
            case SCORE:
                System.out.printf(""
                    + "%10s: %d\n"
                    + "%10s: %d\n"
                    , "You", human.getScore()
                    , "Computer", computer.getScore());
                break;
            case QUIT:
                round = 0;
                break;
        }
        
        computer.makeThrow();
        round--;
    }
    
    public void declareWinner()
    {
        System.out.println("Player 1 score = " + human.getScore());
        System.out.println("Player 2 score = " + computer.getScore());
        if(human.getScore() < computer.getScore())
        {
            System.out.println("The winner is Computer");
        }
        else if (human.getScore() > computer.getScore())
        {
            System.out.println("The winner is Player");
        }
        else
        {
            System.out.println("This game is tie");
        }
    }
    
    public boolean isMatchOver()
    {
        if(round < 1)
            return true;
        else
            return false;
    }
}

