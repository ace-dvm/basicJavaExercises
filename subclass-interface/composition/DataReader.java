import java.util.ArrayList;

/**
 * DataReader talks to the DataInterface.
 * As an exercise, write a new class which implements DataInterface.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class DataReader
{

    private ArrayList<DataInterface> data;

    /**
     * Constructor for objects of class DataReader
     */
    public DataReader()
    {
       data = new ArrayList<DataInterface>();
       fillData();
    }

    /**
     * Runs the method specified by the interface
     */
    public void checkData()
    {
        for(DataInterface d : data){
            System.out.println(d.anAnswer());
        }
    }
    
    private void fillData(){
        data = new DataFiller().fillData(data);
    }
}
