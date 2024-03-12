public class Consultation {
    public static void main(String[] args) {
        int x = 2;

        //  x = x + 1;
        // x++; // postfix
        //  ++x; // prefix
        x = x + 1;
        System.out.println(x);
        // x = x +1;
        System.out.println(x);

        /*
        Воспитательница в детском саду знает что если Джон и Джек оба смеются  или оба ходят серьезные, то они
        что-то затевают и надо быть внимательной.
        Поможем воспитательнице  и напишем логическое выражение, принимающее значение true  когда оба альчика смеются
        или ходят мрачные и false  если нет .
        Решить задачу, используя только логические операторы.

         */
        boolean result, johnSmile, jackSmile;
        johnSmile = false;
        jackSmile = false;
     /*
          johnSmile   jackSmile  result
          true         true        true
          false        false       true
          true         false       false
          false        true        false
      */
        result = johnSmile == jackSmile;
        System.out.println("result = " + result);
        boolean result1 = (johnSmile && jackSmile) || (!johnSmile && !jackSmile);
        System.out.println("result1 = " + result1);
        boolean result2 = !(johnSmile ^ jackSmile);
        System.out.println("result2 = " + result2);


        /*
        Джон рано встает на работу и поэтому он рано ложится спать. Сосед Джона любит слушать громкую музыку.
        У Джона проблемы, если сосед слушает музыку и еще нет семи утра или уже позже 20 часов.
        Написать логическое выражение, принимающее значение true  если у Джона проблемы.

        int hour -  время в диапазоне от 0 до 23 часов
        boolean isMusic -  слушает ли сосед музыку
        boolean problem
        isMusic     hour       problem
        true         6          true
        true         7          false
        false        6          false

         */
        boolean isMusic = false;
        int hour = 6;
        boolean problem = isMusic && (hour > 20 || hour < 7);
        System.out.println("there is a problem! " + problem);


    }
}
