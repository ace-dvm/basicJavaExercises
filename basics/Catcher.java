
/**
 * The Catcher catches Balls.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class Catcher
{

    private boolean caughtBall;
    
    /**
     * Constructor for objects of class Catcher
     */
    public Catcher()
    {
        caughtBall = false;
    }

    /**
     * Catches a ball.
     * 
     * @param  Ball
     * @return boolean (true if the ball is caught)
     */
    public void catchBall(Ball ball){
        caughtBall = true;
    }
    
    /**
     * Returns true if a ball has been caught
     * @return boolean
     */
    public boolean caughtBall(){
        return caughtBall;
    }
}