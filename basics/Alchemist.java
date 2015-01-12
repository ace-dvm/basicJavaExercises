import java.util.HashMap;

/**
 * The Alchemist is a specialist in potions
 * 
 * @author ace
 * @version 9 April 2010
 */
public class Alchemist
{
    private HashMap<String, Potion> potions;

    /**
     * Constructor for objects of class Alchemist
     */
    public Alchemist()
    {
        //  Potion(String smell, String opacity, String color)
        potions = new HashMap<String, Potion>();
        populateHash();
    }

    /**
     * Get a potion of a particular description
     * Valid descriptions are piss and vinegar, liquid courage, and pepto dismal
     * 
     * @param  String description
     * @return  Potion
     */
    public Potion requestPotion(String description){
        Potion p = potions.get(description);
        return p;
    }
    
    private void populateHash(){
        potions.put("piss and vinegar", new Potion("foul", "clear", "yellow"));
        potions.put("liquid courage", new Potion("metallic", "misty", "red"));
        potions.put("pepto dismal", new Potion("minty", "opaque", "green"));
        
    }
    
}
