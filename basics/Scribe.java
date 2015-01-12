import java.util.HashMap;

/**
 * The scribe is an expert in writing scrolls.
 * 
 * @author ace
 * @version 5 April 2010
 */
public class Scribe
{

    private HashMap<String, Scroll> scrolls;
    /**
     * Constructor for objects of class Scribe
     */
    public Scribe(){ 
        scrolls = new HashMap<String, Scroll>();
        populateHash();
    }

    /**
     * Get a scroll of a particular description
     * Valid descriptions are knowledge, virtue, and naughtiness
     * 
     * @param  String description
     * @return Scroll 
     */
    //Scroll(String paper, String ink, String title)
    public Scroll requestScroll(String description){
        return scrolls.get(description);
    }
    
    private void populateHash(){
        scrolls.put("knowledge", new Scroll("parchment", "glowing", "read me"));
        scrolls.put("virtue", new Scroll("hemp", "fountain pen", "andreia"));
        scrolls.put("naughtiness", new Scroll("film base", "black", "lady chatterly"));
    }
    
}
