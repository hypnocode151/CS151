package assignment3;

/**
*
* @author THypnocode
*/
public class Player
{
    private int score;
    protected Throw myThrow;
    private String name;
    
    public Player(String name)
    {
        score = 0;
        this.name = name;
    }
   
    
    public void compareThrows(Player player)
    {    
        String playerName = player.getName();
        Throw playerThrow = player.getThrow();
        
        if((myThrow == Throw.ROCK) && (playerThrow == Throw.PAPER))
        {
            player.incrementScore();
            System.out.println(name + " = Rock\t" + playerName + " = Paper");
            System.out.println(playerName + " wins Round!");
        }
        else if((myThrow == Throw.ROCK) && (playerThrow == Throw.SCISSORS))
        {
            this.incrementScore();
            System.out.println(name + " = Rock\t" + playerName + " = Scissors");
            System.out.println(name + " wins Round!");
        }
        else if((myThrow == Throw.SCISSORS) && (playerThrow == Throw.PAPER))
        {
            this.incrementScore();
            System.out.println(name + " = Scissors\t" + playerName + " = Paper");
            System.out.println(name + " wins Round!");
        }
        else if((myThrow == Throw.SCISSORS) && (playerThrow == Throw.ROCK))
        {
            player.incrementScore();
            System.out.println(name + " = Scissors\t" + playerName + " = Rock");
            System.out.println(playerName + " wins Round!");
        }
        else if((myThrow == Throw.PAPER && playerThrow == Throw.ROCK))
        {
            this.incrementScore();
            System.out.println(name + " = Paper\t" + playerName + " = Rock");
            System.out.println(name + " wins Round!");
        }
        else if((myThrow == Throw.PAPER && playerThrow == Throw.SCISSORS))
        {
            player.incrementScore();
            System.out.println(name + " = Paper\t" + playerName + " = Scissors");
            System.out.println(playerName + " wins Round!");
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
    
    public String getName()
    {
        return name;
    }
    
    public Throw getThrow()
    {
        return myThrow;
    }
 
    public void makeThrow(Throw aThrow)
    {
        myThrow = aThrow;
    }
}