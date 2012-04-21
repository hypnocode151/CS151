package assignment3;

/**
 *
 * Manages the player's score, input, and name.
 * @author Hypnocode
 * 
 */
public class Player
{
    private int score;
    protected Throw myThrow;
    private String name;
    /*
     * Constructs a Player.
     * @param String the name of the player.
     */
    public Player(String name)
    {
        score = 0;
        this.name = name;
    }
   
    /*
     * Compares the throws between two players.
     * @param Player the player of the game.
     */
    public void compareThrows(Player player)
    {    
        String playerName = player.getName();
        Throw playerThrow = player.getThrow();
        int outcome = 0;
        
        // Compare and adjust the score.
        if ((myThrow == Throw.ROCK) && (playerThrow == Throw.PAPER))
            outcome = 1;
        else if ((myThrow == Throw.PAPER && playerThrow == Throw.SCISSORS))
            outcome = 2;
        else if ((myThrow == Throw.SCISSORS) && (playerThrow == Throw.ROCK))
            outcome = 3;
        else if ((myThrow == Throw.ROCK) && (playerThrow == Throw.SCISSORS))
            outcome = 4;
        else if ((myThrow == Throw.SCISSORS) && (playerThrow == Throw.PAPER))
            outcome = 5;
        else if ((myThrow == Throw.PAPER && playerThrow == Throw.ROCK))
            outcome = 6;
        else
            outcome = 0;
        
        // Player has winning throw.
        if (outcome >= 1 && outcome <= 3) {
            player.incrementScore();
        }
        // Computer has winning throw.
        if (outcome >= 4 && outcome <= 6) {
            this.incrementScore();
        }
        
        // Prints the outcome for text interface.
        if (Game.getInterfaceType() == InterfaceType.TEXTINTERFACE) {
            switch (outcome) {
                case 0:
                    System.out.println("It was a tie!");
                    break;
                case 1: 
                    System.out.println(name + " = Rock\t" + playerName + " = Paper");
                    System.out.println(playerName + " wins Round!");
                    break;
                case 2:
                    System.out.println(name + " = Paper\t" + playerName + " = Scissors");
                    System.out.println(playerName + " wins Round!");
                    break;
                case 3:
                    System.out.println(name + " = Scissors\t" + playerName + " = Rock");
                    System.out.println(playerName + " wins Round!");
                    break;
                case 4: 
                    System.out.println(name + " = Rock\t" + playerName + " = Scissors");
                    System.out.println(name + " wins Round!");
                    break;
                case 5: 
                    System.out.println(name + " = Scissors\t" + playerName + " = Paper");
                    System.out.println(name + " wins Round!");
                    break;
                case 6: 
                    System.out.println(name + " = Paper\t" + playerName + " = Rock");
                    System.out.println(name + " wins Round!");
                    break;
            }
        }
        
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