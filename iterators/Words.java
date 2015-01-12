import java.util.ArrayList;
import java.util.List;

/**
 * Creates the words to use with the lyrics generator
 * 
 * @author ace
 * @version 11 April 2010
 */
public class Words
{

    /**
     * Constructor for objects of class Words
     */
    public Words(){
    }

    /**
     * Generates a list of nouns
     * 
     * @return List<String> list of nouns
     */
    public List<String> generateNouns(){
        return nouns();
    }
    
    /**
     * Generates a list of verbs
     * 
     * @return List<String> list of verbs
     */
    public List<String> generateVerbs(){
        return verbs();
    }
    
    /**
     * Generates a list of adjectives
     * 
     * @return List<String> list of adjectives
     */
    public List<String> generateAdjectives(){
        return adjectives();
    }
    
    /**
     * Generates a list of strings which are the lyrics,
     * ready for substitution
     * 
     * @return List<String> lyrics as a list of lines
     */
    public List<String> generateLyrics(){
        return lyrics();
    }
    
    private List<String> nouns(){
        List<String> l = new ArrayList<String>();
        l.add("mastadon");
        l.add("railroad");
        l.add("whisper");
        l.add("feast");
        l.add("pillar");
        l.add("drugstore");
        l.add("inversion");
        l.add("math");
        l.add("sailor");
        l.add("saurian");
        l.add("savannah");
        l.add("honey");
        l.add("elf");
        l.add("nomad");
        l.add("smack");
        return l;
    }
    
    private List<String> verbs(){
        List<String> l = new ArrayList<String>();
        l.add("applauding");
        l.add("squashing");
        l.add("hoping");
        l.add("amusing");
        l.add("yelping");
        l.add("ruffling");
        l.add("heating");
        l.add("ensnaring");
        l.add("counseling");
        l.add("stomping");
        return l;
    }
    
    private List<String> adjectives(){
        List<String> l = new ArrayList<String>();
        l.add("vivid");
        l.add("smutty");
        l.add("regal");
        l.add("obsequious");
        l.add("purple");
        l.add("clairvoyant");
        l.add("spotted");
        l.add("bilious");
        l.add("obstreperous");
        l.add("devestating");
        l.add("poetic");
        l.add("bovine");
        l.add("cosmic");
        l.add("arbitrary");
        l.add("irritable");
        l.add("screaming");
        l.add("sinister");
        l.add("peasant");
        l.add("charming");
        l.add("brutal");
        l.add("Dutch");
        l.add("zealous");
        l.add("essential");
        l.add("destructive");
        l.add("Einsteinian");
        l.add("paleolithic");
        l.add("wooly");
        l.add("spoiled");
        l.add("fierce");
        l.add("acetic");
        l.add("irresponsible");
        l.add("Dionysian");
        l.add("curative");
        l.add("terminal");
        return l;
    }
    
    private List<String> lyrics(){
        List<String> l = new ArrayList<String>();
        l.add("I'm adjective but I'm adjective");
        l.add("I'm adjective but I'm adjective");
        l.add("I'm adjective but I'm adjective , yeah");
        l.add("I'm adjective but I'm adjective");
        l.add("I'm adjective but I'm adjective");
        l.add("I'm adjective but I'm adjective baby");
        l.add("What it all comes down to");
        l.add("Is that everything's gonna be adjective");
        l.add("'cause I've got one noun in my noun");
        l.add("And the other one is verb a noun");
        l.add("I feel adjective but I'm adjective");
        l.add("I'm adjective and I'm adjective");
        l.add("I'm adjective but I'm adjective , yeah");
        l.add("I verb but I'm adjective");
        l.add("I'm adjective but I'm really adjective");
        l.add("I'm adjective and I'm adjective baby");
        l.add("What it all comes down to");
        l.add("Is that everything's gonna be adjective");
        l.add("'cause I've got one noun in my noun");
        l.add("And the other one is verb a noun");
        l.add("And what it all comes down to");
        l.add("Is that I haven't got it all figured out just yet");
        l.add("'cause I've got one noun in my noun");
        l.add("And the other one is verb the noun");
        return l;
    }
}
