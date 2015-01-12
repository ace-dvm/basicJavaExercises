
/**
 * DataInterface is the interface to DataSources.
 * The nice thing about an interface is it doesn't care what is in the other
 * methods of the classes which implement it, as long as they implement
 * the classes described in the interface and return the right data types.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */

public interface DataInterface
{
    /**
     * Gets some data
     */
    int anAnswer();
}
