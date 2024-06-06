package HW_39.task_3;

public class PalindromDemo {
    public static void main(String[] args) {
        Palindrome palindrom = (input) -> {
            String directInput = input.replaceAll("[\\W_]", "").toLowerCase();
            String reverseString = reverseString(directInput);
            return directInput.equals(reverseString);
        };
        String testString1 = "A man, a plan, a canal, Panama!";
        String testString2 = "hello";

        System.out.println("Is \"" + testString1 + "\" a palindrome? " + palindrom.palindromeDetermine(testString1));
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + palindrom.palindromeDetermine(testString2));
    }

    public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}




