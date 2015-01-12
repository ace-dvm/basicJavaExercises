
/**
 * Imagine that this went to something like a database
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class DataSource1 implements DataInterface
{
    
    /**
     * Constructor for objects of class DataSource1
     */
    public DataSource1()
    {

    }

    /**
     * Gets some data
     */
    public int anAnswer()
    {
        return 4;
    }
    
    /**
     * Does something else
     */
    public void somethingElse(){
        System.out.println("Something else");
    }
}
