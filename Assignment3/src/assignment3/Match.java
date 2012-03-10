package assignment3;
/**
 *
 * @author ttran
 */
public class Match 

{
    private Player human = new Human();
    private Player computer = new Computer();
    private int round;
    
    public Match(int round) 
    {
        this.round = round;
    }
    
    
    public void makeThrows()
    {
        human.makeThrow();
        computer.makeThrow();
        round--;
    }
    
    public void DeclareWinner()
    {
        System.out.println("Player 1 score = " + human.getScore());
        System.out.println("Player 2 score = " + computer.getScore());
        if(human.getScore() < computer.getScore())
        {
            System.out.println("The winner is Computer");
        }
        else if (human.getScore() > computer.getScore())
        {
            System.out.println("The winner is Player");
        }
        else
        {
            System.out.println("This game is tie");
        }
    }
    
    public boolean isMatchOver()
    {
        if(round == 0)
            return true;
        else
            return false;
    }
}
