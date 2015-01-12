
/**
 * WonderousThings are things which are wonderous.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */

public interface WonderousThings
{
    /**
     * Wonderous things may drink tea. When they 
     * do the teapot gets more full. Such is Wonderland logic.
     * @return int the fill level of the teapot.
     */
    int drinkTea();
    
    /**
     * Wonderous things may also play chess. They do sometimes
     * cheat, though.
     * @return String response
     */
    public String playChess();
}
