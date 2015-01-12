
/**
 * HeroTester tests the Hero class.
 * The Hero is on a quest and must assemble the correct
 * items to give to the Magician to get the spells he needs.
 * 
 * @author ace  
 * @version 5 April 2010
 */
public class HeroTester
{

    /**
     * Constructor for objects of class HeroTester
     */
    public HeroTester(){
    }

    /**
     * The quest is simple: get a dragon descaler from the Magician.
     * The rule is that you must accomplish it only by reading the
     * documentation from the provided classes: do not use or change
     * any of the internal workings of the other classes.
     */
    public void heroQuest(){
        Hero hero = new Hero();
        if(hero.getSpell().getName().equals("dragon descaler")){
            System.out.println("test heroQuest passes!");
        } else {
            System.out.println("test heroQuest fails");
        }
    }
}
