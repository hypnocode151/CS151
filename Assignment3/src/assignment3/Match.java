package assignment3;
/**
*
* @author Hypnocode
*/
public class Match
{
    CalculatorType calcType;
    private Player human = new Human("Player");
    private Player computer;
    private int round;

    RequestType type = RequestType.TEXTREQUEST;
    
    public Match(int round, int calcType)
    {
        this.round = round;
        this.calcType = CalculatorType.lookUpType(calcType);
        computer = new Computer("Computer", this.calcType);
    }
    
    private void displayScores()
    {
        System.out.printf(""
                    + "%10s: %d\n"
                    + "%10s: %d\n"
                    , human.getName(), human.getScore()
                    , computer.getName(), computer.getScore());
    }
    
    public void makeThrows()
    {
        boolean madeThrow = false;
        
        CommandRequestor cr = CommandRequestor.makeRequestor(type);
        
        switch (cr.requestCommand())
        {
            case THROWROCK:
                human.makeThrow(Throw.ROCK);
                madeThrow = true;
                break;
            case THROWPAPER:
                human.makeThrow(Throw.PAPER);
                madeThrow = true;
                break;
            case THROWSCISSORS:
                human.makeThrow(Throw.SCISSORS);
                madeThrow = true;
                break;
            case HELP:
                Help.displayHelp();
                break;
            case SCORE:
                displayScores();
                break;
            case QUIT:
                round = 0;
                break;
        }
        
        if (round > 0 && madeThrow)
        {
            computer.makeThrow(null);
                   
            human.compareThrows(computer);
            round--;
        }
    }
    
    public void declareWinner()
    {
        System.out.println(human.getName() + " score = " + human.getScore());
        System.out.println(computer.getName() + " score = " 
                + computer.getScore());
        
        if(human.getScore() < computer.getScore())
        {
            System.out.println("The winner is " + computer.getName());
        }
        else if (human.getScore() > computer.getScore())
        {
            System.out.println("The winner is " + human.getName());
        }
        else
        {
            System.out.println("This game is a tie");
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

