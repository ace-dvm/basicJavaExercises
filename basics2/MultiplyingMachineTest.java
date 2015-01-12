/**
 * The objective of the multiplying machine test is to practice
 * the basic structures of OO programming: classes, objects,
 * parameters, return values.
 *
 * @author ace
 * @version 31 March 2010
 */
public class MultiplyingMachineTest
{

    /**
     * Constructor for objects of class MultiplyingMachineTest
     */
    public MultiplyingMachineTest()
    {
    }

    /**
     * This test requires that an Multiplying machine be created
     * which can add two numbers and get the appropriate result.
     */
    public void testMultiplyingMachine(){
        MultiplyingMachine mm = new MultiplyingMachine();
        int x = mm.multiplyTwoNumbers(2, 12);
        if(x == 24){
            System.out.println("testMultiplyingMachine passes test1");
        } else {
            System.out.println("testMultiplyingMachine fails test1");
        }
        int y = mm.multiplyTwoNumbers(81, 76);
        if(y == 6156){
            System.out.println("testMultiplyingMachine passes test2");
        } else {
            System.out.println("testMultiplyingMachine fails test2");
        }
    }
}