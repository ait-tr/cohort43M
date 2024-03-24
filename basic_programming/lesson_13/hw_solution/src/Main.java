public class Main {
    public static void main(String[] args) {
     // Task 1
     //Написать метод, принимающий строку и возвращающий целое число, равное длине строки
        //Пример: Hello -> 5
    String str = "Hello";
    System.out.println("Amount of letters in word " + str + " is " + findLength(str));

    // Task 2
        // Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе и в верхнем регистре.
        //Пример: "Hello", "There" -> HELLOTHERE
        String word1 = "Hello";
        String word2 = "There";
        System.out.println(together(word1,word2));
    }
    public static int findLength(String numLetters){

        return numLetters.length();
    }
    public static String together (String str1, String str2){
        String result = str1.concat(str2);
        String resultUp = result.toUpperCase();
        return resultUp;
    }
}
