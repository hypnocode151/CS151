<<<<<<< HEAD
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.*;
/**
 *
 * @author ttran
 */
public class Player 
{
    public Player()
            {
                
            }
    public int compareThrows()
    {
        ///get throw method?
        return 1;
    }
    
    public void incrementScore()
    {
        score++;
    }
    public int getScore()
    {
        return score;
    }
    
   
    
    public void makeThrow()
    {
        Random randthrow = new Random();
        int guess = randthrow.nextInt(3);
    }
            
    private int score;
    
}

