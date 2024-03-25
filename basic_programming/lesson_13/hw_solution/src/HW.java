public class HW {

    /*
    Задача 1
Написать метод, принимающий строку и возвращающий целое число, равное длине строки
Пример: Hello -> 5

     */
    public static String number () {
        String word = "Logithek";
        System.out.println(word.length());

        return word;
    }

    public static void main(String[] args) {
        number();
        UpWord();

    }

    /*
    Задача 2

    Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе и в верхнем регистре.
            Пример: "Hello", "There" -> HELLOTHERE
    */

    public static String UpWord () {
        String name1 = "hElLo";
        String name2 = "Sergey";
        String Up = name1 + name2;
        System.out.println(Up.toUpperCase());


        return Up;
    }
}
