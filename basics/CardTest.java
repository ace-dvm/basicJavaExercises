
/**
 * CardTest defines a number of behaviors for the Card class
 * HINT: use comments to block out the tests so that you can do
 * them one at a time without getting compiler errors.
 * 
 * @author ace
 * @version 3 April 2010
 */
public class CardTest
{

    /**
     * Constructor for objects of class CardTest
     */
    public CardTest(){
    }

    /**
     * Create a getter and a setter for the card suit.
     */
    public void testSuit(){
        Card card = new Card();
        card.setSuit("hearts");
        String hearts = card.getSuit();
        if(hearts.equals("hearts")){
            System.out.println("test set/getSuit passed");
        } else {
            System.out.println("test set/getSuit failed");
        }
    }

    /**
     * Create a getter and a setter for the card value.
     */
    public void testValue(){
        Card card = new Card();
        card.setValue("six");
        String six = card.getValue();
        if(six.equals("six")){
            System.out.println("test set/getValue passed");
        } else{
            System.out.println("test set/getValue failed");
        }
    }

    /**
     * Create a getter for the rank.  Do not create a field
     * for the rank, and do not create a setter for the rank.
     * Use the ArrayList rankValue to determine the rank.
     * HINT: read the documentation of the ArrayList class to
     * find a method you can use.
     */
    public void testRank(){
        Card card = new Card();
        card.setSuit("hearts");
        card.setValue("six");
        int rank = card.getRank();
        if(rank == 4){
            System.out.println("test getRank passed");
        } else {
            System.out.println("test getRank failed");
        }
        //HINT: What happens if you call your new getRank method without
        //setting the value?  Can you fix this?
    }
    
    /**
     * Make a new constructor for Card which allows you to construct
     * a card with the value and suit as parameters.  Keep the default
     * constructor as well. Be sure to set the card's rank at an appropriate
     * point.
     */
    public void testCardValueSuitConstructor(){
        Card card1 = new Card();
        card1.setValue("king");
        card1.setSuit("hearts");
        Card card2 = new Card("king", "hearts");
        if(card1.getSuit().equals(card2.getSuit())
           && card1.getValue().equals(card2.getValue())
           && card1.getRank()==card2.getRank()){
              System.out.println("test CardValueSuitConstructor passed"); 
        } else {
            System.out.println("test CardValueSuitConstructor failed");
        }
    }
}
