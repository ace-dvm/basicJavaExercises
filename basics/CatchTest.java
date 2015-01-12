/**
 * The objective of catch is to practice the basic structures of OO
 * programming: classes, objects, parameters, return values.
 * 
 * @author ace
 * @version 31 March 2010
 */
public class CatchTest
{

    /**
     * Constructor for objects of class CatchTest
     */
    public CatchTest()
    {
    }

    /**
     * Create a Pitcher, with a method called throwBall.
     * Write this method so that the test below will pass.
     */
    public void catchTest()
    {
        Catcher catcher = new Catcher();
        Pitcher pitcher = new Pitcher();
        Ball ball = new Ball();
        pitcher.throwBall(ball, catcher);
        if(catcher.caughtBall()){
            System.out.println("catchTest passes!");
        } else {
            System.out.println("catchTest fails!");
        }
    }
}
