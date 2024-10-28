import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        try {
            String text = "The price 123 of the product is $19.99 -123 -12.3";
            Pattern pattern = Pattern.compile("-?\\d+[.,]\\d+|-?\\d+");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
