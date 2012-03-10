package assignment3;

/**
*
* @author THypnocode
*/
public class Player
{
    private int score;
    Throw myThrow;
    
    public Player()
            {
                score = 0;
            }
   
    
    public void compareThrows(Player player)
    {    
        if((myThrow == Throw.ROCK) && (player.myThrow == Throw.PAPER))
        {
            player.incrementScore();
            System.out.println("Player = Rock\tComputer = Paper");
            System.out.println("Player wins Round!");
        }
        else if((myThrow == Throw.ROCK) && (player.myThrow == Throw.SCISSORS))
        {
            this.incrementScore();
            System.out.println("Player = Rock\tComputer = Scissors");
            System.out.println("Player wins Round!");
        }
        else if((myThrow == Throw.SCISSORS) && (player.myThrow == Throw.PAPER))
        {
            this.incrementScore();
            System.out.println("Player = Scissors\tComputer = Paper");
            System.out.println("Computer wins Round!");
        }
        else if((myThrow == Throw.SCISSORS) && (player.myThrow == Throw.ROCK))
        {
            player.incrementScore();
            System.out.println("Player = Scissors\tComputer = Rock");
            System.out.println("Computer wins Round!");
        }
        else if((myThrow == Throw.PAPER && player.myThrow == Throw.ROCK))
        {
            this.incrementScore();
            System.out.println("Player = Paper\tComputer = Rock");
            System.out.println("Player wins Round!");
        }
        else if((myThrow == Throw.PAPER && player.myThrow == Throw.SCISSORS))
        {
            player.incrementScore();
            System.out.println("Player = Paper\tComputer = Scissors");
            System.out.println("Computer wins Round!");
        }
        else 
            System.out.println("It was a tie!");
        
        System.out.println();
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void incrementScore()
    {
        score++;
    }
}