/**
 * The objective of the Count test is to practice 
 * the basic structures of OO programming: classes, objects, 
 * parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class TheCountTest
{

    /**
     * Constructor for objects of class TheCountTest
     */
    public TheCountTest()
    {
    }

    /**
     * This test requires that a string parser be created
     * which can parse the strings "one" through "ten".
     * (Technically, only "three" and "nine" are needed to get
     * the test to pass, but it is intended that it is capable
     * of handling any number one to ten.)
     */
    //HINT: to test one at a time, comment out the second test while
    //you're working on this one.
    public void testTenTo10(){
        TheCount count = new TheCount();
        int three = count.tenTo10("three");
        if(three == 3){
            System.out.println("testTenTo10 passes test1");
        }
            else {
                System.out.println("testTenTo10 fails test1");
            }
        int nine = count.tenTo10("nine");
        if(nine == 9){
            System.out.println("testTenTo10 passes test2");
        }
            else {
                System.out.println("testTenTo10 fails test2");
            }
    }
    
    /**
     * This test does the opposite of the method above:
     * it requires that the method is given a number between
     * 1 and 10 and returns the equivilent string
     */
    //HINT: to test one at a time, comment out this test while you're working
    //on the first one.
    public void testInt10ToTen(){
        TheCount count = new TheCount();
        String three = count.int10ToTen(3);
        if(three.equals("three")){
            System.out.println("testInt10ToTen passes test1");
        }
            else {
                System.out.println("testInt10ToTen fails test1");
            }
        String nine = count.int10ToTen(9);
        if(nine.equals("nine")){
            System.out.println("testInt10ToTen passes test2");
        }
            else {
                System.out.println("testInt10ToTen fails test2");
            }
    }
}