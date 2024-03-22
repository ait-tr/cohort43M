public class Main {
    public static void main(String[] args) {
        /*
        Написать метод, принимающий строку и возвращающий целое число, равное длине строки
        Пример: Hello -> 5
         */

        word("Hello");

      /*
      Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе и в верхнем регистре.
      Пример: "Hello", "There" -> HELLOTHERE
       */
        System.out.println(str("Hello", "There"));

    }

    public static int word(String word){
        System.out.println(word.length());

        int counter = 0;
        for (int i = 0; i < word.length(); i++){
        }
        return counter ;
    }

    public static String str(String res, String java1){
        return res.concat(java1);

    }
}
