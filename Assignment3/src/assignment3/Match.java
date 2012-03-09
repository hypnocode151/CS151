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
public class Match 
{
    public Match()
    {
        Player player1 = new Player();
        Player player2 = new Player();
    }
    
    public void makeThrows()
    {
        Random randplay = new Random();
        int guess = randplay.nextInt(3);
    }
    
    public void declareWinner()
    {
        //???
    }
    
    public void isMatchOver()
    {
        //if winner is declared, matchis over.
    }
}
