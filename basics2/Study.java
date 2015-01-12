import java.util.HashMap;

/**
 * The Study contains the Stickyback paper.
 * 
 * @author ace
 * @version 5 April 2010
 */
public class Study
{

    private Stickyback s;
    
    /**
     * Constructor for objects of class Study
     */
    public Study(){ 
        s = new Stickyback("a4");
    }

    /**
     * Gets the Stickyback from the Study
     */
    public Stickyback getStickyback(){
        return s;
    }
}
