public class Main {

    public static void main(String[] args) {

        String word1 = "Hello";
        String word2 = "There";

        System.out.println("\"" + word1 + "\" coteins " + accT(word1) + " symbols");

        System.out.println(Union( word1, word2 ));

    }

    public static int accT(String str) {
        return str.length();
    }

    public static String Union(String str1, String str2) {
        return str1.toUpperCase().concat(str2.toUpperCase());
    }


}
//Задача 1
//Написать метод, принимающий строку и возвращающий целое число, равное длине строки
//Пример: Hello -> 5
//
//Задача 2
//Написать метод, принимающий две строки и возвращающий эти строки,
//соединенные вместе и в верхнем регистре.
//Пример: "Hello", "There" -> HELLOTHERE