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
    private Player player = new Player();
    private Player Computer = new Player();
    private int round;
    public Match(int round) {
        this.round = round;
    }
    
    
    public void makeThrows()
    {
        player.makeThrow();
        Computer.makeThrow();
        round--;
    }
    
    public void DeclareWinner()
    {
        System.out.println("Player 1 score = " + player.getScore());
        System.out.println("Player 2 score = " + Computer.getScore());
        if(player.getScore() < Computer.getScore())
        {
            System.out.println("The winner is Computer");
        }
        else if (player.getScore() > Computer.getScore())
        {
            System.out.println("The winner is Player");
        }
        else
        {
            System.out.println("This game is tie");
        }
    }
    
    public void isMatchOver()
    {
        if(round == 0)
        {
            System.out.println("The Match is over");
        }
    }
}
