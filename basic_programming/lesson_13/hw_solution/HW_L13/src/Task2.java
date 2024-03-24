public class Task2 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "There";
        System.out.println("Соединенные строки в верхнем регистре: " + concatenateAndUpperCase(str1, str2));
    }

    public static String concatenateAndUpperCase(String str1, String str2) {
        return str1.concat(str2).toUpperCase();
    }
}

