import java.util.ArrayList;

/**
 * The train class contains the basic information about a train,
 * but right now it's rather useless as it has no public
 * methods. Do not change the private methods to public.  Do create
 * your own public methods so that TrainTest will pass.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Train
{
    private String name;
    private int length;
    private final ArrayList<String> maxSpeed = fillMaxSpeed();

    /**
     * Constructor for objects of class Train
     */
    public Train(){
        name = "";
        length = 0;
    }
    
    
    private ArrayList<String> fillMaxSpeed(){
        ArrayList<String> al = new ArrayList<String>();
        al.add(0, "350.0");//minimum train length is 0: engine only
        al.add(1, "344.7");
        al.add(2, "340.2");
        al.add(3, "332.8");
        al.add(4, "321.2");
        al.add(5, "315.9");
        al.add(6, "311.0");
        al.trimToSize();//trims the capacity of the ArrayList to its current size.
        return al;
    }

}
