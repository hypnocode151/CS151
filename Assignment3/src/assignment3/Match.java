package assignment3;
/**
*
* @author Hypnocode
* the Match Class manages all the functions of a match.
*/
public class Match
{
    private CalculatorType calcType;
    private Player human = new Human("Player");
    private Player computer;
    private int round;
    private RequestType requestType;

    /*
     * Creates a Match
     * @param int the number of the rounds. 
     * @param int the type of the calculator.
     */
    public Match(int round, int calcType, RequestType requestType)
    {
        this.round = round;
        this.calcType = CalculatorType.lookUpType(calcType);
        computer = new Computer("Computer", this.calcType);
        this.requestType = requestType;
    }

    public Match(int round, CalculatorType calculatorType, RequestType requestType) 
    {
        this.round = round;
        calcType = calculatorType;
        computer = new Computer("Computer", this.calcType);
        this.requestType = requestType;
    }
   /*
    * Displas the current score
    */
    private void displayScores()
    {
        System.out.printf(""
                    + "%10s: %d\n"
                    + "%10s: %d\n"
                    , human.getName(), human.getScore()
                    , computer.getName(), computer.getScore());
    }
    /*
     * Make throws both human and computer.
     */
    public void makeThrows()
    {
        boolean madeThrow = false;
        
        CommandRequestor cr = CommandRequestor.makeRequestor(requestType);
        
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
            
            ThrowHistorian.recordThrows(human.getThrow(), computer.getThrow());
                   
            human.compareThrows(computer);
            round--;
        }
    }
    /*
     * Declare a winner based the score.
     */
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
    /*
     * Check to see if match is over.
     * @return true if match is over.
     */
    public boolean isMatchOver()
    {
        if(round < 1)
            return true;
        else
            return false;
    }
}

