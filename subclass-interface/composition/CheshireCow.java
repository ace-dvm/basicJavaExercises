
/**
 * CheshireCows are a kind of CheshireThing
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class CheshireCow implements CheshireThings
{
    private Cheshire c;

    /**
     * Constructor for objects of class CheshireCow
     */
    public CheshireCow(Cheshire c)
    {
        this.c = c;
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
