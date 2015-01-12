
/**
 * TrainTest defines a number of behaviors for the Train class
 * HINT: use comments to block out the tests so that you can do
 * them one at a time without getting compiler errors.
 * 
 * @author ace
 * @version 3 April 2010
 */
public class TrainTest
{

    /**
     * Constructor for objects of class TrainTest
     */
    public TrainTest(){
    }

    /**
     * Create a getter and a setter for the train name.
     */
    public void testName(){
        Train train = new Train();
        train.setName("Heartland Runner");
        String runner = train.getName();
        if(runner.equals("Heartland Runner")){
            System.out.println("test set/getName passed");
        } else {
            System.out.println("test set/getName failed");
        }
    }

    /**
     * Create a getter and a setter for the train length.
     */
    public void testLength(){
        Train train = new Train();
        train.setLength(5);
        int five = train.getLength();
        if(five == 5){
            System.out.println("test set/getLength passed");
        } else{
            System.out.println("test set/getLength failed");
        }
    }

    /**
     * Create a getter for the maxSpeed.  Do not create a field
     * for the maxSpeed, and do not create a setter for the maxSpeed.
     * Use the ArrayList maxSpeed to determine the maxSpeed.
     * HINT: read the documentation of the ArrayList class to
     * find a method you can use.
     */
    public void testMaxSpeed(){
        Train train = new Train();
        train.setName("Orient Express");
        train.setLength(4);
        String maxSpeed = train.getMaxSpeed();
        if(maxSpeed.equals("321.2")){
            System.out.println("test getMaxSpeed passed");
        } else {
            System.out.println("test getMaxSpeed failed");
        }
    }
    
    /**
     * Make a new constructor for Train which allows you to construct
     * a train with its name and length as parameters.  Keep the default
     * constructor as well.
     */
    public void testTrainNameLengthConstructor(){
        Train train1 = new Train();
        train1.setLength(3);
        train1.setName("Fu Man Choo Choo");
        Train train2 = new Train("Fu Man Choo Choo", 3);
        if(train1.getName().equals(train2.getName())
           && train1.getLength()==train2.getLength()
           && train1.getMaxSpeed().equals(train2.getMaxSpeed())){
              System.out.println("test TrainNameLengthConstructor passed"); 
        } else {
            System.out.println("test TrainNameLengthConstructor failed");
        }
    }
}
