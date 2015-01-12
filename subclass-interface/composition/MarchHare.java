
/**
 * MarchHares are a kind of WonderousThing
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class MarchHare implements WonderousThings
{

    private Wonderous w;

    /**
     * Constructor for objects of class MarchHare
     */
    public MarchHare(Wonderous w)
    {
        this.w = w;
    }
    
     /**
     * Wonderous things may drink tea. When they 
     * do the teapot gets more full. Such is Wonderland logic.
     * @return int the fill level of the teapot.
     */
    public int drinkTea()
    {
        return w.drinkTea();
    }
    
    /**
     * Wonderous things may also play chess. They do sometimes
     * cheat, though.
     * @return String response
     */
    public String playChess(){
        return w.playChess();
    }
}
