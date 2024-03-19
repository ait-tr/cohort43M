import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        multiTab();

        numTriangle(9);

    }

//Написать метод, принимающий с клавиатуры положительное число
//и печатающий затем таблицу умножения для этого числа
//(т.е. печатающий произведение этого числа на все числа от 1 до 10).
//Использовать в решении цикл for.


    public static void multiTab() {

        Scanner numNScan = new Scanner(System.in);
            System.out.println("Enter number ");
            int numBer = numNScan.nextInt();
        for (int i =1; i<=10; i++){
            System.out.println( numBer+ " * " + i +" = " +numBer*i);

        }
    }

//Вывести на экран треугольник, состоящий из цифр от 1 до числа n
//используя циклы while

    public static void numTriangle(int n) {

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }


        }

    }
