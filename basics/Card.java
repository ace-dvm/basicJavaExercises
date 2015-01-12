import java.util.ArrayList;

/**
 * The card class contains the basic information about a playing
 * card, but right now it's rather useless as it has no public
 * methods. Do not change the private methods to public.  Do create
 * your own public methods so that CardTest will pass.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
    private String value;
    private String suit;
    private final ArrayList<String> rankValue = fillRankValue();
    //rankValue allows a card's rank to be looked up by its value,

    /**
     * Constructor for objects of class Card
     */
    public Card(){
        value = "";
        suit = "";
    }
    
    
    private ArrayList<String> fillRankValue(){
        ArrayList<String> al = new ArrayList<String>();
        al.add(0, "two"); //the two is the lowest-ranked card, it has a rank of 0
        al.add(1, "three");
        al.add(2, "four");
        al.add(3, "five");
        al.add(4, "six");
        al.add(5, "seven");
        al.add(6, "eight");
        al.add(7, "nine");
        al.add(8, "ten");
        al.add(9, "jack");
        al.add(10, "queen");
        al.add(11, "king");
        al.add(12, "ace");
        al.trimToSize();//trims the capacity of the ArrayList to its current size.
        return al;
    }

}
