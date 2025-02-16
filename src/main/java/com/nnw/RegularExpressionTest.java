import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {
    public static void main(String[] args) {
        // Create a pattern to be searched
        // Custom pattern
        Pattern p = Pattern.compile("geeks");
        // Search above pattern in "geeksforgeeks.org"
        Matcher m = p.matcher("geeksforgeeks.org");
        // Finding string using find() method
        while (m.find()){
            // Print starting and ending indexes
            // of the pattern in the text
            // using this functionality of this class
            System.out.println("Pattern found from "
                                + m.start() + " to "
                                + (m.end() - 1));
        }
        System.out.println("----------------");
        p = Pattern.compile("[a-z]");
        m = p.matcher("g");
        System.out.println(m.find());
        System.out.println("----------------");
        p = Pattern.compile("[0-9a-zA-Z]");
        m = p.matcher("20,a30,45");
        System.out.println(m.find());
        System.out.println("----------------");
        p = Pattern.compile("[^a-z]");
        m = p.matcher("200a");
        while (m.find()){
            System.out.println("Found from " + m.start() + " to "+ (m.end()-1));
        } 
        System.out.println("----------------"); 
        p = Pattern.compile("[^0-9]");
        m = p.matcher("200a");
        while (m.find()){
            System.out.println("Found from " + m.start() + " to "+ (m.end()-1));
        }   
  }
}
// Outputs Match found
