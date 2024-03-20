import java.util.Scanner;

public class Zadacha2 {
    public static void main(String[] args) {
       /* Задача 2
        Переписать задачу про треугольник из сегодняшнего занятия используя циклы while */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedite chuslo");
        int n = scanner.nextInt();

        int i=1;
        while (i<=n){
            int j = 1;
            while (j<=i) {
                System.out.print((j + ""));
                j++;
            }
            System.out.println();
            i++;
            }
        }
    }


