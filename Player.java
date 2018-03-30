
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Player extends Deck
{
    //System.out.println("Name: ");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    
    public int amtMoney;
    
    public int playerHand[];
    Random rand = new Random();
    public Player(String nm, int mon)
    {
        nm = this.name;
        mon = this.amtMoney;
    }
    
    public int bet(int amt) {
        return amt;
    }
    
    public void hit() {
        System.out.println("Hit?");
            if(sc.next().equals("yes")) {
                System.out.println("How much?");
                if(sc.nextInt() <= player1.amtMoney) {
                    bet(sc.nextInt());
                    player1.deal();
                }
                else {
                    System.out.println("You don't have enough");
                    hit();
                }
            }
            else {
                stay();
            }
    }
    
    public void deal() {
        int  n = rand.nextInt(52) + 1;
        int hand = player1.handTotal();
        playerHand[player1.handTotal(playerHand) - 1] = deck.get(n-1).value;
        deck.remove(n-1);
    }
    
    public void stay() {
        while(handTotal(dealerHand) < handTotal(playerHand))
            dealer.deal();
        determineWinner();
    }
    
    public int handTotal(int hand[]) {
        int sum = 0;
        for(int b = 0; b < hand.length; b++) {
            if(hand[b] == 1) {
                //create two separate hands, one with one added and another with 11 added
            }
            else {
                sum += hand[b];
            }
        }
        System.out.println("Hand total is: " + sum);
        return sum;
    }
    
    public String toString() {
        return "Your name is " + this.name + " and have " + this.amtMoney;
    }
}
