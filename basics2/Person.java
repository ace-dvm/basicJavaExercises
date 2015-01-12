
/**
 * Person represents a person, or something like one, in this logic puzzle.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class Person
{
    // instance variables - replace the example below with your own
    private boolean isMad;
    private boolean isAMarchHare;
    private boolean isAPolitician;
    private boolean isAManager;
    private boolean isASecretary;
    private boolean isARabbit;
    private boolean isWhite;
    private boolean isWonderous;
    private boolean isLate;

    /**
     * Constructor for objects of class Person
     */
    public Person(){
        isMad = false;
        isAMarchHare = false;
        isAPolitician = false;
        isAManager = false;
        isASecretary = false;
        isARabbit = false;
        isWhite = false;
        isWonderous = false;
        isLate = false;
    }
    
    public void setIsMad(){
        isMad = true;
        madCheck();
    }
    
    public boolean getIsMad(){
        return isMad;
    }
    
    public void setIsAMarchHare(){
        isAMarchHare = true;
        hareCheck();
    }
    
    public boolean getIsAMarchHare(){
        return isAMarchHare;
    }
    
    public void setIsAPolitician(){
        isAPolitician = true;
        politicianCheck();
    }
    
    public boolean getIsAPolitician(){
        return isAPolitician;
    }
        
    public void setIsAManager(){
        isAManager = true;
        managerCheck();
    }
    
    public boolean getIsAManager(){
        return isAManager;
    }
   
    public void setIsASecretary(){
        isASecretary = true;
        secretaryCheck();
    }
    
    public boolean getIsASecretary(){
        return isASecretary;
    }
             
    public void setIsARabbit(){
        isARabbit = true;
    }
    
    public boolean getIsARabbit(){
        return isARabbit;
    }

    public void setIsWhite(){
        isWhite = true;
        whiteCheck();
    }
    
    public boolean getIsWhite(){
        return isWhite;
    }
        
    public void setIsWonderous(){
        isWonderous = true;
        wonderousCheck();
    }
    
    public boolean getIsWonderous(){
        return isWonderous;
    }
    
    public void setIsLate(){
        isLate = true;
        lateCheck();
    }
    
    public boolean getIsLate(){
        return isLate;
    }
    
    private void madCheck(){
        if(isAPolitician && isLate){
            isMad = false;
        } else {
            isAManager = false; isAPolitician = false;    
            isLate = false; isWhite = false;
        }
    }
    
    private void hareCheck(){
        if(isMad){
        } else {
            if(isAPolitician && isLate){
                isAMarchHare = false;
            } else {
                setIsMad();
            }
        }
    }
    
    private void politicianCheck(){
        if(isMad && (isAMarchHare || isASecretary || !isLate)){
            isAPolitician = false;
        } else {
            isAMarchHare = false; isMad = false;
            isASecretary = false;
        }
    }
    
    private void managerCheck(){
        if(!(isAPolitician || isLate) && isMad){
            isAManager = false;
        } else {
            setIsAPolitician();
        }
    }
    
    private void secretaryCheck(){
        if(!isMad && (isAPolitician || isLate)){
            isASecretary = false;
        } else {
            setIsMad();
        }
    }
    
    private void whiteCheck(){
        if(isARabbit){
            if(isMad && (isAMarchHare || isASecretary)){
                isWhite = false;
            } else {
                isLate = true;
                setIsWonderous();
            }
        }
    }
    
    private void wonderousCheck(){
        if(isLate){
            isWhite = true;
            setIsARabbit();
        } else {
            isARabbit = false;
        }
    }
    
    private void lateCheck(){
        if(isMad && (isAMarchHare || isASecretary)){
            isLate = false;
        } else {
            isMad = false; isAMarchHare = false;
            isASecretary = false;
            if(isWonderous){
                isWhite = true;
                setIsARabbit();
            }
        }
    }
}
