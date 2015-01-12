
/**
 * CheshireCats are a kind of WonderousThing
 * They are also a kind of CheshireThing.
 * This presents no problem since we are using interfaces.
 * 
 * ** Interfaces are more work to use in Java
 * ** The purpose of the interface is to check at compile-time
 * **that we are not making any illegal changes
 * ** Interfaces make for ugly class diagrams
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class CheshireCat implements WonderousThings, CheshireThings
{

    private Wonderous w;
    private Cheshire c;

    /**
     * Constructor for objects of class CheshireCat
     */
    public CheshireCat(Wonderous w, Cheshire c)
    {
        this.w = w;
        this.c = c;
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
    
    /**
     * Cheshire things sometimes disappear, wholly or in part.
     * @return String parts which are visible
     */
    public String disappear()
    {
        return c.disappear();
    }
    
    /**
     * Cheshire things also grin.
     */
    public void grin(){
        c.grin();
    }
}
