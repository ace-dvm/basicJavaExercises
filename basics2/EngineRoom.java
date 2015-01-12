import java.util.HashMap;

/**
 * You must bring the right tools to the Engine Room, where you
 * can use them to build the Very Clever Device
 * 
 * @author ace
 * @version 11 April 2010
 */
public class EngineRoom
{
    private Wrench w;
    private FuzzyHandcuffs f;
    private Stickyback s;

    /**
     * Constructor for objects of class EngineRoom
     */
    public EngineRoom(){
        populateObjects();
    }

    /**
     * Returns a VeryCleverDevice, if you have the right equipment.
     * @param a Wrench from the Basement
     * @param a FuzzyHandcuffs from the Bedroom
     * @param a Stickyback from the Study
     */
    public Device makeVeryCleverDevice(Wrench wrench, FuzzyHandcuffs fuzzy, Stickyback sticky){
        if(wrench.equals(w) && fuzzy.equals(f) && sticky.equals(s)){
                return new Device("Very Clever");
            } else {
                System.out.println("Try getting the items from the rooms indicated in the documentation");
                return null;
            }
    }
    
    private void populateObjects(){
        w = new Wrench(314159);
        f = new FuzzyHandcuffs("chartreuse");
        s = new Stickyback("a4");
    }
}
