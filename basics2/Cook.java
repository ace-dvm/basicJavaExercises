
/**
 * The Cook accepts orders.
 *
 * @author ace
 * @version 31 March 2010
 */
public class Cook
{

    private boolean acceptedOrder;

    /**
     * Constructor for objects of class Cook
     */
    public Cook()
    {
        acceptedOrder = false;
    }

    /**
     * Accepts an order to cook it.
     *
     * @param  Order
     * @return boolean (true if the order has been accepted)
     */
    public void acceptOrder(Order order){
        acceptedOrder = true;
    }

    /**
     * Returns true if an order has been accepted
     * @return boolean
     */
    public boolean acceptedOrder(){
        return acceptedOrder;
    }
}