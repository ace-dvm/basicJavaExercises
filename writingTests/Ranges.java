
/**
 * Ranges should:
 * if the input is less than -50, return the string "low"
 * if the input is between -50 and 50, return the string "normal"
 * if the input is greater than 50, return the string "high"
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ranges
{
    
    /**
     * Constructor for objects of class Ranges
     */
    public Ranges()
    {
    }

    /**
     * Ranges method
     * 
     * @param  int  the number to be tested
     * @return String the result: low, normal, high
     */
    public String checkRange(int y)
    {
        if(y<-50){
            return "low";
        }
        if(y<50){
            return "normal";
        }
        if(y>50){
            return "high";
        }
        else return "oops";
    }
}
