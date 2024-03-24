public class Zadacha2 {

    /*  Задача 2
Написать метод, принимающий две строки и возвращающий эти строки,
 соединенные вместе и в верхнем регистре.
Пример: "Hello", "There" -> HELLOTHERE */
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        String combinedUpperCase = concatenateAndToUpperCase(str1,str2);
        System.out.println(" "+ combinedUpperCase);
    }
    public static String concatenateAndToUpperCase(String str1,String str2) {
        String combinedString = str1.concat(str2);
        return combinedString.toUpperCase();
    }
}
