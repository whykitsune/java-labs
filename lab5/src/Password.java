import java.util.regex.*;

public class Password {
    public static void main(String[] args) {
        try{
//            String text = "p4sSword123";
            String text = "abcd1234";
//            String text = "Abcdefgh";
//            String text = "A1B";
            Pattern pattern1 = Pattern.compile("\\b[A-Za-z0-9]{8,16}\\b");
            Pattern pattern2 = Pattern.compile("[A-Z]+");
            Pattern pattern3 = Pattern.compile("\\d+");
            Matcher matcher1 = pattern1.matcher(text);
            Matcher matcher2 = pattern2.matcher(text);
            Matcher matcher3 = pattern3.matcher(text);
            if (matcher1.matches() && matcher2.find() && matcher3.find()) {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
