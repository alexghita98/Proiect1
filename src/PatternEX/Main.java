package PatternEX;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // String to be scanned to find the pattern.
        ArrayList<String> file = new ArrayList<String>();

        file.add("email1@smth.com");
        file.add("nosuchpattern");
        file.add("email2@smth.com");

        String pattern = "^(.+)@(.+)$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        for(String line: file)
        {
            Matcher m = r.matcher(line);
            if (m.find( )) {
                System.out.println("Found value: " + m.group(0) );
            }else {
                System.out.println("NO MATCH");
            }
        }

        // Now create matcher object.

    }
}
