package assignment3;

/**
*
* @author THypnocode
* the Player class manages the player's score, input, and name
*/
public class Player
{
    private int score;
    protected Throw myThrow;
    private String name;
    /*
     * Construct a Player.
     * @param String the name of the player.
     */
    public Player(String name)
    {
        score = 0;
        this.name = name;
    }
   
    /*
     * Compare the throws between two players.
     * @param Player the player of the game.
     */
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
    /*
     * Gets the current score.
     * @return the current score.
     */
    public int getScore()
    {
        return score;
    }
    
    
   /*
    * Increments the score of the winning player.
    */
    public void incrementScore()
    {
        score++;
    }
    
    
    /*
     * Get the name of the Player.
     * @return the name of Player.
     */
    public String getName()
    {
        return name;
    }
    
    /*
     * Gets the Thow from the player.
     * @return the throw.
     */    
    public Throw getThrow()
    {
        return myThrow;
    }
 
    
    /*
     * Makes a throw.
     * @param Throw the throw to be made.
     */
    public void makeThrow(Throw aThrow)
    {
        myThrow = aThrow;
    }
}