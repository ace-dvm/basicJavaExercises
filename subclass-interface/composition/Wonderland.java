
/**
 * Wonderland checks to make sure that everything is working properly.
 * 
 * @author (ace) 
 * @version (1 June 2010)
 */
public class Wonderland
{

    private MarchHare march;
    private MadHatter madH;
    private CheshireCat cat;
    private CheshireCow cow;

    /**
     * Constructor for objects of class Wonderland
     */
    public Wonderland()
    {
        march = new MarchHare(new Wonderous());
        madH = new MadHatter(new Wonderous());
        cat = new CheshireCat(new Wonderous(), new Cheshire());
        cow = new CheshireCow(new Cheshire());
    }

    /**
     * Check to see that all is well in Wonderland
     */
    public void playInWonderland()
    {
        System.out.println("The March Hare has " + march.drinkTea() + " more cups of tea");
        System.out.println("The hatter says: " + madH.playChess());
        System.out.println("The cat says: " + cat.playChess());
        System.out.println("The cat has " + cat.disappear() + "visible");
        System.out.print("The cow moos."); cow.grin();
    }
}
