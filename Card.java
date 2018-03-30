
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    int value;
    String suit;
    String rank;
    public Card(int val, String s, String r)
    {
        val = this.value;
        s = this.suit;
        r = this.rank;
    }

    public int getValue() {
        return this.value;
    }
    public String getSuit() {
        return this.suit;
    }
}
