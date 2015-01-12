
/**
 * Write a description of class Potion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Potion
{
    private String smell;
    private String opacity;
    private String color;

    /**
     * Constructor for objects of class Potion
     */
    public Potion(String smell, String opacity, String color){
        this.smell = smell;
        this.opacity = opacity;
        this.color = color;
    }
    
    public String getSmell(){
        return smell;
    }
    
    public String getOpacity(){
        return opacity;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getDescription(){
        return "a " + smell + "-smelling, " + opacity + " " + color + " potion";
    }
    
    public boolean equals(Potion p){
        if(p.getSmell().equals(smell)
            && p.getOpacity().equals(opacity)
            && p.getColor().equals(color)){
                return true;
            } else {
                return false;
            }
    }
}
