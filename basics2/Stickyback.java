
/**
 * Write a description of class Stickyback here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stickyback
{
    private String papersize;
    
    /**
     * Constructor for objects of class Stickyback
     */
    public Stickyback(String papersize){
        this.papersize = papersize;
    }
    
    public String getPapersize(){
        return papersize;
    }
    
    public boolean equals(Stickyback s){
        if(papersize.equals(s.getPapersize())){
            return true;
        } else {
            return false;
        }
    }
}
