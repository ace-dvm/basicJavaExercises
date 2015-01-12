import java.util.Random;
import java.util.ArrayList;

/**
 * Wonderous things are things which are wonderous.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class Wonderous implements WonderousThings
{
    private int teapot;
    private Random rnd;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class Wonderous
     */
    public Wonderous()
    {
        teapot = 0;
        rnd = new Random();
        responses = new ArrayList<String>();
        fillResponses();
    }

    /**
     * Wonderous things may drink tea. When they 
     * do the teapot gets more full. Such is Wonderland logic.
     * @return int the fill level of the teapot.
     */
    public int drinkTea()
    {
        teapot = teapot + 1;
        return teapot;
    }
    
    /**
     * Wonderous things may also play chess. They do sometimes
     * cheat, though.
     * @return String response
     */
    public String playChess(){
        return responses.get(rnd.nextInt(responses.size()));
    }
    
    private void fillResponses(){
        responses.add("Checkmate! I win!");
        responses.add("Knight to Queen's 5th!");
        responses.add("Fire breathing dragons to King's two!");
        responses.add("Would you please give that piece back? It was my favorite pawn.");
    }
}
