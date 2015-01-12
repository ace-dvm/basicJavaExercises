import java.util.ArrayList;
import java.util.Random;

/**
 * SimpleIterator reviews the basic behavior of an iterator.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class SimpleIteratorTest
{
    private ArrayList<Thing> things;
    int nThings;
    Random rnd;

    /**
     * Constructor for objects of class SimpleIteratorTest
     */
    public SimpleIteratorTest(){
        rnd = new Random();
        things = new ArrayList<Thing>();
    }

    /**
     * Thing has a space for a number.  Number the things by 5's,
     * starting at 5.
     */
    public void testNumber(){
        fillThings();
        ThingNumberer tn = new ThingNumberer();
        ArrayList<Thing> numberedThings = tn.numberThings(things);
        int index = rnd.nextInt(nThings);
        if(numberedThings.size()==things.size()
           && numberedThings.get(index).getNumber()==((index + 1)*5)){
                System.out.println("testNumber passes!");
            } else {
                System.out.println("testNumber fails");
            }
    }
    
    private void fillThings(){
        int index = 0;
        nThings = rnd.nextInt(100) + 1; //ensures that there will always be at least one Thing
        while(index <= nThings){
            things.add(new Thing());
            index++;
        }
    }
}
