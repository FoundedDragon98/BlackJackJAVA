
/**
 * Write a description of class Deck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
import java.util.ArrayList;
public class Deck
{
    Random rand = new Random();
    public ArrayList<Card> deck = new ArrayList<Card>();
    Card value;
    Card suit;
    Card rank;
    
    public Deck()
    {
        deck = new ArrayList<Card>();
    }
    
    
    public void initializeDeck() {
        String[] suits = {"Hearts", "Clubs", "Spades", "Diamonds"};
        String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        
        for(String s : suits) {
            int value = 1;
            for(String r : ranks) {
                Card temp = new Card(value, s, r);
                value++;
                deck.add(temp);
            }
        }
    }
    public void shuffle() {
        initializeDeck();
    }
}
