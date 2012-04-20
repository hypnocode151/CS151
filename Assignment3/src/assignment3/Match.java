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
    private int rounds;
    private int currentRound = 0;
    private RequestType requestType;
    private boolean computerHasThrown;

    /*
     * Creates a Match
     * @param int the number of the rounds. 
     * @param int the type of the calculator.
     */
    public Match(int rounds, int calcType, RequestType requestType)
    {
        this.rounds = rounds;
        this.calcType = CalculatorType.lookUpType(calcType);
        computer = new Computer("Computer", this.calcType);
        this.requestType = requestType;
    }

    public Match(int rounds, CalculatorType calculatorType, RequestType requestType) 
    {
        this.rounds = rounds;
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
        
        if (!computerHasThrown)
        {
            computer.makeThrow(null);
            computerHasThrown = true;
        }
        if (GameFrame.isGUI())
            GameFrame.gameDisplay.updateThrow(computer.getThrow());
        
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
                currentRound = 0;
                break;
        }
        
        if (currentRound < rounds && madeThrow)
        {
            ThrowHistorian.recordThrows(human.getThrow(), computer.getThrow());
                   
            human.compareThrows(computer);
            currentRound++;
            
            if (GameFrame.isGUI())
            {
                GameFrame.gameDisplay.updateScores(human.getScore(), computer.getScore());
                GameFrame.gameDisplay.updateRound(currentRound);
                GameFrame.gameDisplay.updateImages(human.getThrow(), computer.getThrow());
            }
            
            computerHasThrown = false;
        }
    }
    /*
     * Declare a winner based the score.
     */
    public void declareWinner()
    {
        if (!GameFrame.isGUI())
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
        else
        {
            GameFrame.gameDisplay.declareWinner();
        }
    }
    /*
     * Check to see if match is over.
     * @return true if match is over.
     */
    public boolean isMatchOver()
    {
        if(currentRound >= rounds)
            return true;
        else
            return false;
    }
}

