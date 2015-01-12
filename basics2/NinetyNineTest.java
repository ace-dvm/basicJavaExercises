import java.util.ArrayList;
import java.util.Random;

/**
 * The objective of the NinetyNineTest is to practice 
 * the basic structures of OO programming: classes, objects, 
 * parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class NinetyNineTest
{

    /**
     * Constructor for objects of class NinetyNineTest
     */
    public NinetyNineTest()
    {
    }

    /**
     * This test requires that one Bottle be removed every
     * time this method is called.
     */
    public void test99Bottles(){
        ArrayList<Bottle> bottles = populateBottles();
        int numberOfBottles = bottles.size();
        Bartender callahan = new Bartender();
        ArrayList b = callahan.takeOneDown(bottles);
        int numberAfter = b.size();
        if(numberOfBottles == (numberAfter + 1)){
            System.out.println("testNinetyNine passes!");
        } else {
            System.out.println("testNinetyNine fails");
        }
    }
    
    private ArrayList<Bottle> populateBottles(){
        ArrayList<Bottle> foo = new ArrayList<Bottle>();
        Random rnd = new Random();
        int counter = 0;
        int numberOfBottles = rnd.nextInt(97) + 2; //ensures there will always be 2-99 bottles
        while(counter < numberOfBottles){
            foo.add(new Bottle());
            counter++;
        }
        return foo;
    }
}