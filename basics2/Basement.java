import java.util.HashMap;

/**
 * The basement contains the wrench.
 * 
 * @author ace
 * @version 5 April 2010
 */
public class Basement
{

    private Wrench w;
    
    /**
     * Constructor for objects of class Basement
     */
    public Basement(){ 
        w = new Wrench(314159);
    }

    /**
     * Gets the wrench from the basement
     */
    public Wrench getWrench(){
        return w;
    }
}
