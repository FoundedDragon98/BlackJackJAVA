
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Game
{
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = sc.next();
    public static void main(String[] args) {
        
        Player player1 = new Player(name, 0);
        Dealer dealer = new Dealer(99999999);
        playGame();
    }
    
    
    Card cards;
    public Game()
    {
        
    }
    
    public void playGame() {
        shuffle();
        player1.deal();
        player1.deal();
        dealer.deal();
        dealer.deal();
        hit();
    }
    
    
    
    public int determineWinner() {
        if(handTotal(playerHand) == 21)
            return 1;
        if(handTotal(playerHand) < 21 && handTotal(playerHand) > handTotal(dealerHand))
            return 1;
        if(handTotal(playerHand) <= 21 && handTotal(playerHand) == handTotal(dealerHand))
            return 0;
        else if(handTotal(playerHand) > 21 || handTotal(playerHand) < handTotal(dealerHand))
            return -1;
    }
    
    public void endGame() {
        System.out.println("You won $" + player1.amtMoney);
    }
}
