
/**
 * Person represents the important aspects of a person according to
 * Carroll's logic puzzle
 * 
 * @author ace
 * @version 11 April 2010
 */
public class Person
{
    // instance variables - replace the example below with your own
    private boolean isBaby;
    private boolean canManageCrocodile;
    private boolean isLogical;

    /**
     * Constructor for objects of class Person
     */
    public Person(boolean isBaby, boolean canManageCrocodile, boolean isLogical){
        this.isBaby = isBaby;
        this.canManageCrocodile = canManageCrocodile;
        this.isLogical = isLogical;
        consistencyCheck();
    }
    
    /**
     * Carroll tells us that no one is despised who can manage a crocodile,
     * and no babies are logical. Therefore we must correct for the following
     * impossible combinations:
     * isBaby + isLogical
     * isBaby + canManageCrocodile
     * !isLogical + canManageCrocodile
     */
    private void consistencyCheck(){
        if(isBaby && isLogical){
            //this is not possible, so we must decide if this Person
            //is not a baby or is not logical.
            //if they can manage a crocodile, then 2/3 says they are logical -
            //therefore not a baby.
            if(canManageCrocodile){
                isBaby = false;
            } else {
                isLogical = false;
            }
        }
        if(isBaby && canManageCrocodile){
            //again, we check to see if the person is logical, since no
            //one who can manage a crocodile is illogical.
            if(!isLogical){
                canManageCrocodile = false;
            } //isBaby && isLogical && canManageCrocodile is dealt with above
        }
        if(!isLogical && canManageCrocodile){
            if(!isBaby){
                isLogical = true;
            } //the other possibilities have already been dealt with above
        }
    }

    /**
     * Returns true if this Person is a Baby
     * @return  boolean 
     */
    public boolean isBaby(){
        return isBaby;
    }
    
    /**
     * Returns true if this Person can manage a crocodile
     * @return  boolean 
     */
    public boolean canManageCrocodile(){
        return canManageCrocodile;
    }
    
    /**
     * Returns true if this Person is a Logical
     * @return  boolean 
     */
    public boolean isLogical(){
        return isLogical;
    }
}
