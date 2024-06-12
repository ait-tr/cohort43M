package HW_43.task_4;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(150);
        }

        System.out.println("Array: ");
        for (int num : array){
            System.out.print(num + " ");
        }
        System.out.println();

         try {
             System.out.println("Enter the index of the array element:");
             int index = scanner.nextInt();
             System.out.println("Value of array element with index " + index + ": " + array[index]);
         } catch (ArrayIndexOutOfBoundsException e){
             System.out.println("Error: Index is out of bounds of the array!");
         }
        scanner.close();
    }
}
