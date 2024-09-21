public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String word = args[i];
            System.out.println(isPalindrome(word));
        }
            
    }

    public static String reverseString(String s) {
        
        String reversed_s = "";
        for (int i = 0; i < s.length(); i++) {
            reversed_s = s.charAt(i) + reversed_s;
        }
        return reversed_s;
    }
    public static boolean isPalindrome(String s) {
        
        return reverseString(s).equals(s);
    }
}
