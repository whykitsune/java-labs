import java.util.regex.*;

public class GivenLetter {
    public static void main(String[] args) {
        try {
            String text = "aaabbbccc Bbbcccaaa cccaaabbb bbbaaa b";
            char letter = 'b';
            Pattern pattern = Pattern.compile("\\b" + letter + "[A-z]*",
                    Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
