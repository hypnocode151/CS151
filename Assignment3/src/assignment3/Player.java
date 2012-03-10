
package assignment3;

import java.util.*;
/**
 *
 * @author ttran
 */
public abstract class Player 
{
    
    Throw myThrow;
    
    public Player()
            {
                score = 0;
            }
   
    
    public int compareThrows(Player player, Player player2)
    {
        if(player.myThrow == Player.Throw.ROCK && player2.myThrow == Player.Throw.ROCK)
        return 0;
       
        if(player.myThrow == Player.Throw.ROCK && player2.myThrow == Player.Throw.PAPER)
            return 1;
        
        if(player.myThrow == Player.Throw.ROCK && player2.myThrow == Player.Throw.SCISSOR)
            return 2;
        
        if(player.myThrow == Player.Throw.SCISSOR && player2.myThrow == Player.Throw.PAPER)
            return 1;
        
        if(player.myThrow == Player.Throw.SCISSOR && player2.myThrow == Player.Throw.ROCK)
            return 2;
         
        if(player.myThrow == Player.Throw.SCISSOR && player2.myThrow == Player.Throw.SCISSOR)
            return 0;
          
        if(player.myThrow == Player.Throw.PAPER && player2.myThrow == Player.Throw.PAPER)
            return 0;
           
        if(player.myThrow == Player.Throw.PAPER && player2.myThrow == Player.Throw.ROCK)
            return 1;
        
        if(player.myThrow == Player.Throw.PAPER && player2.myThrow == Player.Throw.SCISSOR)
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
