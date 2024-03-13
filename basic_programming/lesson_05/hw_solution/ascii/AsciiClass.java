package ascii;

public class AsciiClass {
    public static void main (String[] args) {
        /*
        Task 2
        Написать программу, выводящую на экран ASCII значение символа.
        Пример: 'А' результат - 65
         */
        Character ch = 'A';
        var chAscii = (long) ch;
        System.out.println(chAscii);
    }
}
