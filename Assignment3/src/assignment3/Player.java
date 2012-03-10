package assignment3;

import java.util.*;
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
            player.incrementScore();
        else if((myThrow == Throw.ROCK) && (player.myThrow == Throw.SCISSORS))
            incrementScore();
        else if((myThrow == Throw.SCISSORS) && (player.myThrow == Throw.PAPER))
            incrementScore();
        else if((myThrow == Throw.SCISSORS) && (player.myThrow == Throw.ROCK))
            player.incrementScore();
        else if((myThrow == Throw.PAPER && player.myThrow == Throw.ROCK))
            incrementScore();
        else if((myThrow == Throw.PAPER && player.myThrow == Throw.SCISSORS))
            player.incrementScore();
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