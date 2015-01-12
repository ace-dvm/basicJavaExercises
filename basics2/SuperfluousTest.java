
/**
 * Write a new class called Superfluous which allows the test below
 * to pass.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class SuperfluousTest
{

    /**
     * Constructor for objects of class SuperfluousTest
     */
    public SuperfluousTest(){
    }

    /**
     * All March hares are mad.
     * Nothing which is mad is superfluous.
     * All politicians are superfluous.
     * All managers are politicians.
     * All secretaries are mad.
     * All rabbits that are white are wonderous.
     * All wonderous things that are late are rabbits.
     * No wonderous things which are not late are rabbits.
     * Things which are late are superfluous.
     * Are managers superfluous? Are secretaries? Is a white rabbit superfluous?
     */
    public void testIsItSuperfluous(){
        Superfluous superflu = new Superfluous();
        Person manager = new Person();
        manager.setIsAManager();
        Person secretary = new Person();
        secretary.setIsASecretary();
        Person whiteRabbit = new Person();
        whiteRabbit.setIsARabbit();
        whiteRabbit.setIsWhite();
        boolean managerB = superflu.isItSuperfluous(manager);
        boolean secretaryB = superflu.isItSuperfluous(secretary);
        boolean whiteB = superflu.isItSuperfluous(whiteRabbit);
        if(managerB==true && secretaryB == false && whiteB==true){
            System.out.println("testIsItSuperfluous passed!");
        } else {
            System.out.println("testIsItSuperfluous failed");
        }
    }
}
