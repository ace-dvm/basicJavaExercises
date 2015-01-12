
/**
 * In addition to writing the Alice in Wonderland books, Lewis Carroll
 * wrote on the subject of math and logic.
 * Write a new class named Carroll, with a method isItDespised() as
 * described in the test below.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class CarrollTest
{
    Carroll carroll;

    /**
     * Constructor for objects of class CarrollTest
     */
    public CarrollTest(){
        carroll = new Carroll();
    }

    /**
     * All babies are illogical.
     * Nobody is despised who can manage a crocodile.
     * Illogical persons are despised.
     * 
     * This doesn't explain whether logical persons
     * who cannot manage a crococdile are despised or not,
     * so we assume that they are not.
     * 
     * Do not change the Person class, only your new class Carroll.
     */
    public void testIsItDespised(){
        Person baby = new Person(true, false, true);
        Person crocHunter = new Person(false, true, false);
        Person ambiguous = new Person(false, false, true);
        boolean babyD = carroll.isItDespised(baby);
        boolean crocD = carroll.isItDespised(crocHunter);
        boolean ambiD = carroll.isItDespised(ambiguous);
        if(babyD==true && crocD==false && ambiD==false){
            System.out.println("testIsItDespised passed!");
        } else {
            System.out.println("testIsItDespised failed");
        }
    }
}
