package chappter6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class video42 {public static void main(String[] args) {
    
    Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    Matcher matcher = pattern.matcher("HUNG@GMAIL.COM");
    System.out.println("Input string  matches regex - "+matcher.matches());
}
    
}
