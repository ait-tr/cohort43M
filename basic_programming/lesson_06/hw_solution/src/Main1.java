import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        //Task 1
        //Есть две переменные целого типа. Написать программу, выводящую на экран сумму их значений, а в том в случае, если эти числа равны, должна выводиться двойная сумма.
        //Пример: 1 + 2 -> 3
        //3 + 2 -> 5
        //2 + 2 -> 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a1");
        int a1 = scanner.nextInt();
        System.out.print("Enter number b1");
        int b1 = scanner.nextInt();
        int sum = (a1 + b1);
        if(a1 == b1) {System.out.println(a1+" + " + b1 +" -> " + (sum+sum));
        }
        else{System.out.println(a1+" + " + b1 +" -> " + sum);

        }

        //Task 2
        // Есть три переменные целого типа. Написать программу, которая сравнивает эти числа и выводит на экран результат:
        //
        //    All numbers are equal если они равны
        //    All numbers are different если все они все разные
        //    Some numbers are equal если какие-то из них равны
        int num1, num2, num3;
        num1 = 5;
        num2 = 2;
        num3 = 3;
        if(num1 == num2 && num2 == num3){System.out.println("All numbers are equal"); }
        if(num1 != num2 && num2 != num3){System.out.println("All numbers are different"); }
        else {System.out.println("Some numbers are equal");}
    }
}
