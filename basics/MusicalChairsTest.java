import java.util.ArrayList;
import java.util.Random;

/**
 * The objective of the MusicalChairsTest is to practice 
 * the basic structures of OO programming: classes, objects, 
 * parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class MusicalChairsTest
{

    /**
     * Constructor for objects of class MusicalChairsTest
     */
    public MusicalChairsTest()
    {
    }

    /**
     * This test requires that one Chair be removed every
     * time this method is called.
     */
    public void testMusicalChairs(){
        ArrayList<Chair> chairs = populateChairs();
        int numberOfChairs = chairs.size();
        Teacher mrsSmith = new Teacher();
        chairs = mrsSmith.removeChair(chairs);
        int numberAfter = chairs.size();
        if(numberOfChairs == (numberAfter + 1)){
            System.out.println("testMusicalChairs passes!");
        } else {
            System.out.println("testMusicalChairs fails");
        }
    }
    
    private ArrayList<Chair> populateChairs(){
        ArrayList<Chair> foo = new ArrayList<Chair>();
        Random rnd = new Random();
        int counter = 0;
        int numberOfChairs = rnd.nextInt(10) + 2; //ensures there will always be at least 2 chairs
        while(counter < numberOfChairs){
            foo.add(new Chair());
            counter++;
        }
        return foo;
    }
}