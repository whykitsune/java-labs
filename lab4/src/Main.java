
public class Main {
    public static void main(String[] args) {
//        String num = "123";
//        String num = "12a3";
//        String num = "-123";
        String num = "1-23";
        try {
            isNum(num);
            int numOut = Integer.parseInt(num);
            System.out.println(numOut);
        } catch (CustomNumberFormatException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void isNum(String num) throws CustomNumberFormatException {
        boolean marker = true;
        if (!(num.charAt(0) == '-' || Character.isDigit(num.charAt(0)))) {
            marker = false;
        }
        for (int i = 1; i < num.length(); i++) {
            if (!Character.isDigit(num.charAt(i))) {
                marker = false;
                break;
            }
        }
        if (!marker) {
            throw new CustomNumberFormatException("Строка не является числом", num);
        }
    }
}