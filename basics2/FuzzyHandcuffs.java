/**
 * Write a description of class FuzzyHandcuffs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuzzyHandcuffs
{
    String color;   

    /**
     * Constructor for objects of class FuzzyHandcuffs
     */
    public FuzzyHandcuffs(String color){
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean equals(FuzzyHandcuffs f){
        if(color.equals(f.getColor())){
            return true;
        } else {
            return false;
        }
    }
}