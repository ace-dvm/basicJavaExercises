import java.util.Random;

/**
 * HiLo returns a "high" value (>50) when asked for one,
 * and a "low" value (<-50) when asked for one.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiLo
{
    Random rnd = new Random();

    /**
     * Constructor for objects of class HiLo
     */
    public HiLo()
    {
       rnd = new Random();
    }

    /**
     * Returns a high or low number.
     */
    public int hiLo(String s)
    {
        if(s.equals("high")){
            return getHigh();
        }
        if(s.equals("low")){
            return getLow();
        }
        return 0;
    }
    
    private int getHigh(){
        boolean done = false;
        int i = 0;
        while(!done){
            i = rnd.nextInt();
            if(i > 50){
                done = true;
            }
            if(i < -50){
                i = -i;
                done = true;
            }
        }
        return i;
    }
    
     private int getLow(){
        boolean done = false;
        int i = 0;
        while(!done){
            i = rnd.nextInt();
            if(i < -50){
                done = true;
            }
            if(i > 50){
                i = -i;
                done = true;
            }
        }
        return i;
    }
}
