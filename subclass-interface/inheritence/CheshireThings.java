import java.util.Random;
import java.util.ArrayList;

/**
 * Cheshire things are a class of things which smile and disappear often.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class CheshireThings
{
    private ArrayList<String> visibleParts;
    private Random rnd;

    /**
     * Constructor for objects of class CheshireThings
     */
    public CheshireThings()
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
