
/**
 * Write a description of class Splits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Splits
{

    /**
     * Constructor for objects of class Splits
     */
    public Splits()
    {
    }

    /**
     * This method takes a number, adds 7,
     * divides by 57, and then returns the 3 digits
     * following the decimal
     * 
     * @param  int: any integer
     * @return  int the result of the above operation
     */
    public int convolution(int y)
    {
        //converts y to type double and adds 7
        double yy = y+7;
        //divides by 57
        double d = yy/57;
        //converts this result to a String
        String s = "" + d;
        //searches the String to find the decimal
        int decimal = s.indexOf(".");
        //puts the first number in front of the decimal into a string
        String three = "" + s.charAt(decimal+1);
        //second
        three += s.charAt(decimal+2);
        //third
        three += s.charAt(decimal+3);
        //gets the integer value of the 3-digit string
        int answer = Integer.valueOf(three);
        return answer;
    }
}
