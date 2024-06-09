package HomeWorkL39.Task3;

public class PalindromeCheckerExample {
    public static void main(String[] args) {
                PalindromeChecker palindromeChecker = (input) -> {
            String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();
            int length = cleanedInput.length();
            for (int i = 0; i < length / 2; i++) {
                if (cleanedInput.charAt(i) != cleanedInput.charAt(length - i - 1)) {
                    return false;
                }
            }
            return true;
        };


        String[] testStrings = { "A man a plan a canal Panama", "hello", "racecar", "Java" };

        /*
        Лямбда-выражение принимает строку, удаляет все пробелы и приводит строку к нижнему регистру.
Затем проверяет, является ли строка палиндромом, сравнивая символы с начала и конца строки.
В методе main создается массив строк testStrings для проверки.
Для каждой строки в массиве вызывается метод isPalindrome, и результат выводится на консоль.
         */
        for (String testString : testStrings) {
            System.out.println("\"" + testString + "\" is a palindrome: " + palindromeChecker.isPalindrome(testString));
        }
    }
}
