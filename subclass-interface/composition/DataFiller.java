import java.util.ArrayList;

/**
 * Write a description of class DataFiller here.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class DataFiller
{

    /**
     * Constructor for objects of class DataFiller
     */
    public DataFiller()
    {
    }

    /**
     * Fills a list with data sources
     */
    public ArrayList<DataInterface> fillData(ArrayList<DataInterface> di)
    {
        di.add(new DataSource1());
        di.add(new DataSource2());
        return di;
    }
}
