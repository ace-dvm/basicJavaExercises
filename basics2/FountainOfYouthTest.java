/**
 * The objective of the Fountain of Youth test is to practice 
 * the basic structures of OO programming: classes, objects, 
 * parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class FountainOfYouthTest
{

    /**
     * Constructor for objects of class FountainOfYouthTest
     */
    public FountainOfYouthTest()
    {
    }

    /**
     * This test requires different behavior depending on what the input is
     * There is more than one way to solve this, but the intent is that the
     * the fountain will take two years off the age of someone who is very old,
     * and one year off the age of someone who is middle aged, and no years
     * if you are still young.
     */
    public void testFountain(){
        FountainOfYouth fountainOfYouth = new FountainOfYouth();
        int seventy = fountainOfYouth.visit(70);
        int sixtynine = fountainOfYouth.visit(69);
        int thirty = fountainOfYouth.visit(30);
        int twentynine = fountainOfYouth.visit(29);
        if(seventy == 68
        && sixtynine == 68
        && thirty == 29
        && twentynine == 29){
            System.out.println("testFountain passes!");
        }
            else {
                System.out.println("testFountain fails");
            }
    }
}