package homework_39.Task3;

public class PalindromeDemo {

    public static void main(String[] args) {

        PalindromeChecker checker = str -> {
            String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
            int length = cleanedStr.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanedStr.charAt(i) != cleanedStr.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        };

        String testString = "Madam Im Adam";



        boolean result =checker.isPalindrome(testString);
        System.out.println("String " + testString + " is a Palindrome " + result);




    }
}
