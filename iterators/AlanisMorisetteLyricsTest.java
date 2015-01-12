import java.util.ArrayList;

/**
 * test the AlanisMorisetteLyrics generator.
 * 
 * @author ace
 * @version 11 April 2010
 */
public class AlanisMorisetteLyricsTest
{
    AlanisMorissetteLyrics alanis;

    /**
     * Constructor for objects of class AlanisMorisetteLyricsTest
     */
    public AlanisMorisetteLyricsTest(){
        alanis = new AlanisMorissetteLyrics();
    }

    /**
     * Tests whether nouns are handled correctly
     */
    public void testNouns(){
        ArrayList<String> testNouns = createTestNouns();
        String result = alanis.subNoun("noun", testNouns);
        if(result.equals(testNouns.get(0))){
            System.out.println("testNouns passes!");
        } else {
            System.out.println("testNouns fails");
        }
    }
    
    /**
     * Tests whether verbs are handled correctly
     */
    public void testVerbs(){
        ArrayList<String> testVerbs = createTestVerbs();
        String result = alanis.subVerb("verb", testVerbs);
        if(result.equals(testVerbs.get(0))){
            System.out.println("testVerbs passes!");
        } else {
            System.out.println("testVerbs fails");
        }
    }
    
    /**
     * Tests whether the system can differentiate nouns and verbs
     */
    public void testWords(){
        ArrayList<String> testNouns = createTestNouns();
        ArrayList<String> testVerbs = createTestVerbs();
        ArrayList<String> testAdj = createTestAdj();
        String result1 = alanis.subWords("noun", testNouns, testVerbs, testAdj);
        String result2 = alanis.subWords("verb", testNouns, testVerbs, testAdj);
        String result3 = alanis.subWords("adjective", testNouns, testVerbs, testAdj);
        if(result1.equals(testNouns.get(0))
           && result2.equals(testVerbs.get(0))){
               System.out.println("testWords passes!");
            } else {
                System.out.println("testWords fails");
            }
    }
    
    /**
     * Creates a sample line and tests that words were substituted
     * correctly.
     */
    public void testLine(){
        //HINT: use
        //String[] result = "this is a test".split("\\s");
        //to split the line into words
        ArrayList<String> testNouns = createTestNouns();
        ArrayList<String> testVerbs = createTestVerbs();
        ArrayList<String> testAdj = createTestAdj();
        String line = "I've got one hand in my noun and the other one's verb the noun";
        String result = alanis.subWords(line, testNouns, testVerbs, testAdj);
        System.out.println(result);
        String expected = "I've got one hand in my " + testNouns.get(0) +
                " and the other one's " + testVerbs.get(0) +
                " the " + testNouns.get(0);
        System.out.println(expected);
        if(result.equals(expected)){
               System.out.println("testLine passes!");
            } else {
                System.out.println("testLine fails");
            }
        }
    
    /**
     * Acceptance test:
     * Use the lists supplied in the Words class to generate 
     * new Alanis Morissette lyrics, using random words from
     * the nouns, adjectives, and verbs provided
     */
    public void testGenerator(){
        Words words = new Words();
        System.out.println(alanis.generate(words.generateLyrics(), 
                           words.generateNouns(), words.generateVerbs(), 
                           words.generateAdjectives()));
    }
    
    private ArrayList<String> createTestNouns(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("petard");
        return a;
    }
    
    private ArrayList<String> createTestVerbs(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("hoisting");
        return a;
    }
    
    private ArrayList<String> createTestAdj(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("gaseous");
        return a;
    }
    
}
