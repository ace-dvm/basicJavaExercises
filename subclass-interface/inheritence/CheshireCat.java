import java.util.ArrayList;
import java.util.Random;

/**
 * CheshireCats are a kind of WonderousThing
 * However, they are also a CheshireThing.
 * This is a problem, since Java does not allow multiple inheritence.
 * You either can duplicate the methods from CheshireThings into
 * CheshireCat, or you can use composition instead.
 * 
 * ** Inheritence is easy in Java
 * ** Inheritence makes for neat class diagrams
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class CheshireCat extends WonderousThings
{

    private ArrayList<String> visibleParts;
    private Random rnd;

    /**
     * Constructor for objects of class CheshireCat
     */
    public CheshireCat()
    {
        visibleParts = new ArrayList<String>();
        fillParts();
        rnd = new Random();
    }
    
     /**
     * Cheshire things sometimes disappear, wholly or in part.
     * @return String parts which are visible
     */
    public String disappear()
    {
        String parts = "";
        int nrOfParts = rnd.nextInt(visibleParts.size());
        int index = 0;
        while(index < nrOfParts){
            parts += visibleParts.get(rnd.nextInt(visibleParts.size())) + ", ";
            index ++;
        }
        if (parts.equals("")){
            parts = "nothing ";
        }
        return parts;
    }
    
    /**
     * Cheshire things also grin.
     */
    public void grin(){
        System.out.println("It grins mysteriously.");
    }
    
    private void fillParts(){
        visibleParts.add("teeth");
        visibleParts.add("eyes");
        visibleParts.add("ears");
        visibleParts.add("tail");
        visibleParts.add("head");
        visibleParts.add("body");
        visibleParts.add("front legs");
        visibleParts.add("back legs");
    }
}
