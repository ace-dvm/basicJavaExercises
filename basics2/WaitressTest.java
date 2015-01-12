/**
 * The objective of waitress is to practice the basic structures of OO
 * programming: classes, objects, parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class WaitressTest
{

    /**
     * Constructor for objects of class WaitressTest
     */
    public WaitressTest()
    {
    }

    /**
     * Create a Waitress, with a method called takeOrder.
     * Write this method so that the test below will pass.
     */
    public void takeOrderTest()
    {
        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Order order = new Order();
        waitress.takeOrder(order, cook);
        if(cook.acceptedOrder()){
            System.out.println("takeOrderTest passes!");
        } else {
            System.out.println("takeOrderTest fails!");
        }
    }
}
