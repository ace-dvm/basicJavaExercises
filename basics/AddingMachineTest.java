/**
 * The objective of the adding machine test is to practice 
 * the basic structures of OO programming: classes, objects, 
 * parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class AddingMachineTest
{

    /**
     * Constructor for objects of class AddingMachineTest
     */
    public AddingMachineTest()
    {
    }

    /**
     * This test requires that an adding machine be created
     * which can add two numbers and get the appropriate result.
     */
    public void testAddingMachine(){
        AddingMachine am = new AddingMachine();
        int x = am.addTwoNumbers(31, 48);
        if(x == 79){
            System.out.println("testAddingMachine passes test1");
        } else {
            System.out.println("testAddingMachine fails test1");
        }
        int y = am.addTwoNumbers(1072, 81);
        if(y == 1153){
            System.out.println("testAddingMachine passes test2");
        } else {
            System.out.println("testAddingMachine fails test2");
        }    
    }
}