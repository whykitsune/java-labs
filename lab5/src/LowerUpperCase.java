import java.util.regex.*;

public class LowerUpperCase {
    public static void main(String[] args) {
        try {
            String text = "aaaa bbAbba AbbAba bbba";
            String result = text.replaceAll("([a-z][A-Z])", "!$1!");
            System.out.println(result);
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
