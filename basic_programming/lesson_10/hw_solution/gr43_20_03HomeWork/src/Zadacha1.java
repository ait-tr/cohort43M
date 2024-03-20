import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) {
        /* Задача 1
Написать метод, принимающий с клавиатуры положительное число и печатающий затем
таблицу умножения для этого числа ( т.е. печатающий произведение этого числа на все
числа от 1 до 10).
Использовать в решении цикл for. */

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
    printUmTab(n);
    }
    public static int printUmTab(int n){
        int i=1;
        for (i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+(n*i));
        }
        return n;
    }
}
