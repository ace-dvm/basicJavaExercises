
/**
 * Write a description of class Wrench here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wrench
{
    int upc;   

    /**
     * Constructor for objects of class Wrench
     */
    public Wrench(int upc){
        this.upc = upc;
    }
    
    public int getUPC(){
        return upc;
    }
    
    public boolean equals(Wrench w){
        if(upc == w.getUPC()){
            return true;
        } else {
            return false;
        }
    }
}
