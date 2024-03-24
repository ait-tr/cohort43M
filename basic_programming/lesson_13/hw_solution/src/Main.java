public class Main {
    /*Написать метод, принимающий строку и возвращающий целое число, равное длине строки
    Пример: Hello -> 5*/
    public static int getLength(String str) {
        return str.length();
    }

    public static void main(String[] args) {
        String input = "Hello";
        int length = getLength(input);
        System.out.println(length);

        String input1 = "Hello";
        String input2 = "There";
        String result = concatenateAndUpperCase(input1, input2);
        System.out.println(result);

    }
/*
Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе и в верхнем регистре.
Пример: "Hello", "There" -> HELLOTHERE
 */
public static String concatenateAndUpperCase(String str1, String str2) {
    return (str1 + str2).toUpperCase();
}


}
