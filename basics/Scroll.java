
/**
 * Write a description of class Scroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scroll
{
    private String paper;
    private String ink;
    private String title;

    /**
     * Constructor for objects of class Scroll
     */
    public Scroll(String paper, String ink, String title){
       this.paper = paper;
       this.ink = ink;
       this.title = title;
    }

    public String getPaper(){
        return paper;
    }
    
    public String getInk(){
        return ink;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getDescription(){
        return "a " + paper + " scroll, in " + ink + " ink, titled " + title;
    }
    
    public boolean equals(Scroll s){
        if(s.getPaper().equals(paper)
            && s.getInk().equals(ink)
            && s.getTitle().equals(title)){
                return true;
            } else {
                return false;
            }
    }
}
