package assignment3;

import java.util.*;
/**
*
* @author ttran
*/
public class Player
{
    
    Throw myThrow;
    
    public Player()
            {
                score = 0;
            }
   
    
    public int compareThrows(Player player, Player player2)
    {
        if(player.myThrow == Throw.ROCK && player2.myThrow == Throw.ROCK)
        return 0;
       
        if(player.myThrow == Throw.ROCK && player2.myThrow == Throw.PAPER)
            return 1;
        
        if(player.myThrow == Throw.ROCK && player2.myThrow == Throw.SCISSORS)
            return 2;
        
        if(player.myThrow == Throw.SCISSORS && player2.myThrow == Throw.PAPER)
            return 1;
        
        if(player.myThrow == Throw.SCISSORS && player2.myThrow == Throw.ROCK)
            return 2;
         
        if(player.myThrow == Throw.SCISSORS && player2.myThrow == Throw.SCISSORS)
            return 0;
        
        if(player.myThrow == Throw.PAPER && player2.myThrow == Throw.PAPER)
            return 0;
           
        if(player.myThrow == Throw.PAPER && player2.myThrow == Throw.ROCK)
            return 1;
        
        if(player.myThrow == Throw.PAPER && player2.myThrow == Throw.SCISSORS)
            return 2;
              
        return 0;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void incrementScore()
    {
        score++;
    }
    
    public void makeThrow()
    {
        
    }
            
    private int score;
    
}