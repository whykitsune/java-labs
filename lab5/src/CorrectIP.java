import java.util.regex.*;

public class CorrectIP {
    public static void main(String[] args) {
        try {
            String text = "123.123.86.1";
//            String text = "123.123.086.1";
//            String text = "999.123.123.123";

            Pattern pattern = Pattern.compile(
                    "([1-9][0-9]{0,2}|0)\\.([1-9][0-9]{0,2}|0)\\." +
                            "([1-9][0-9]{0,2}|0)\\.([1-9][0-9]{0,2}|0)");
            Matcher matcher = pattern.matcher(text);
            if (matcher.matches()) {
                String[] array = text.split("\\.");
                boolean marker = true;
                for (String num : array) {
                    if (Integer.parseInt(num) > 255) {
                        marker = false;
                        break;
                    }
                }
                if (marker) {
                    System.out.println("Valid IP address");
                } else {
                    System.out.println("Invalid IP address");
                }
            } else {
                System.out.println("Invalid IP address");
            }
        } catch (PatternSyntaxException e) {
            System.err.println(e.getMessage());
        }
    }
}
