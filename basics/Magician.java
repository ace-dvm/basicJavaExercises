import java.util.HashMap;

/**
 * The Magician provides spells, if you give him the right tools.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class Magician
{
    private HashMap<String, Potion> potions;
    private HashMap<String, Scroll> scrolls;

    /**
     * Constructor for objects of class Magician
     */
    public Magician(){
        potions = new HashMap<String, Potion>();
        scrolls = new HashMap<String, Scroll>();
        populateHash();
    }

    /**
     * Returns a dragon descaler
     * 
     * @param Potion a potion of Piss and vinegar
     * @param Scroll a scroll of Knowledge
     * @return Spell a dragon descaler
     */
    public Spell getDragonDescaler(Potion pissAndVinegar, Scroll knowledge){
        if(pissAndVinegar.equals(potions.get("piss and vinegar"))
            && knowledge.equals(scrolls.get("knowledge"))){
                return new Spell("dragon descaler");
            } else {
                System.out.println("I need a potion of Piss and vinegar and a scroll of Knowledge.");
                return null;
            }
    }
    
    /**
     * Returns a Carnot engine
     * 
     * @param Potion a potion of liquid courage
     * @param Scroll a scroll of virtue
     * @return Spell a Carnot engine
     */
     public Spell getCarnotEngine(Potion liquidCourage, Scroll virtue){
        if(liquidCourage.equals(potions.get("liquid courage"))
            && virtue.equals(scrolls.get("virtue"))){
                return new Spell("Carnot engine");
            } else {
                return null;
            }
        }
            
    private void populateHash(){
        potions.put("piss and vinegar", new Potion("foul", "clear", "yellow"));
        potions.put("liquid courage", new Potion("metallic", "misty", "red"));
        potions.put("pepto dismal", new Potion("minty", "opaque", "green"));
        scrolls.put("knowledge", new Scroll("parchment", "glowing", "read me"));
        scrolls.put("virtue", new Scroll("hemp", "fountain pen", "andreia"));
        scrolls.put("naughtiness", new Scroll("film base", "black", "lady chatterly"));
    }
}
