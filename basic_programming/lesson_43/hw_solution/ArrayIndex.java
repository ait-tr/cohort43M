package HomeWork.Task4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Задача "Индекс вне границ массива": Напишите программу, которая создаёт
массив целых чисел заданного размера, заполненный случайными числами.
Затем программа должна запрашивать у пользователя индекс и пытаться
вывести значение элемента массива по этому индексу. Используйте обработку
исключений для перехвата ArrayIndexOutOfBoundsException, если указанный
индекс выходит за пределы массива.*/
public class ArrayIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Введите размер массива: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        for( int i = 0;i<size; i++){
            array[i] = random.nextInt(100);
        }
        System.out.println("Массив:");
        for(int num:array){
            System.out.println(num+" ");
        }
        System.out.println();
         while(true){
             try{
                 System.out.println("Введите индекс эллемента массиваЮ ");
                 int index = sc.nextInt();
                 System.out.println("Значение элемента по индексу" + index+": "+array[index]);
                 break;
             }catch (ArrayIndexOutOfBoundsException e){
                 System.out.println("Ошибка: индекс за границей массива.Попробуйте снова.");
             }catch (InputMismatchException e){
                 System.out.println("Ошибка:некоректный ввод. Попробуйте снова");
                 sc.next();
             }
         }
         sc.close();
    }
}
