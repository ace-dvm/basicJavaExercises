
/**
 * Trenches models part of a military game
 * 
 * @author ace
 * @version 11 April 2010
 */
public class TrenchesTest
{
    Trenches trenches;
    
    /**
     * Constructor for objects of class TrenchesTest
     */
    public TrenchesTest(){
        trenches = new Trenches();
    }

    /**
     * Tests that the various pieces move correctly when the
     * move() method is called
     */
    //NOTE: your solution should scale to allow correct behavior for
    //any number of each of the 3 kinds of units.
    public void testMove(){
        Calvary calvary = new Calvary();
        trenches.place(calvary, 1);
        Infantry infantry = new Infantry();
        trenches.place(infantry, 3);
        Tank tank = new Tank();
        trenches.place(tank, 5);
        trenches.move();
        int cPos = calvary.getPosition();
        int iPos = infantry.getPosition();
        int tPos = tank.getPosition();
        //NOTE that the Calvary moves 3, the Infantry moves 2, and the Tank moves 1
        if(cPos==4 && iPos==5 && tPos==6){
            System.out.println("testMove passed!");
        } else {
            System.out.println("testMove failed");
        }
    }
}
