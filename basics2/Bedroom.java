import java.util.HashMap;

/**
 * The Bedroom contains the FuzzyHandcuffs.
 * 
 * @author ace
 * @version 5 April 2010
 */
public class Bedroom
{

    private FuzzyHandcuffs f;
    
    /**
     * Constructor for objects of class Bedroom
     */
    public Bedroom(){ 
        f = new FuzzyHandcuffs("chartreuse");
    }

    /**
     * Gets the fuzzy handcuffs from the bedroom
     */
    public FuzzyHandcuffs getFuzzyHandcuffs(){
        return f;
    }
}
