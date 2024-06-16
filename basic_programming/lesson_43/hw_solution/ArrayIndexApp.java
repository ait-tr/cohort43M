package Homework_43.task4;

import java.util.Random;
import java.util.Scanner;

//Задача "Индекс вне границ массива": Напишите программу, которая создаёт массив
// целых чисел заданного размера, заполненный случайными числами. Затем программа
// должна запрашивать у пользователя индекс и пытаться вывести значение элемента
// массива по этому индексу. Используйте обработку исключений для перехвата
// ArrayIndexOutOfBoundsException, если указанный индекс выходит за пределы массива.
public class ArrayIndexApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

      
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();


        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }


        while (true) {
            try {

                System.out.print("Введите индекс элемента для получения значения (или -1 для выхода): ");
                int index = scanner.nextInt();

                if (index == -1) {
                    break;
                }

                System.out.println("Значение элемента с индексом " + index + ": " + array[index]);
            } catch (ArrayIndexOutOfBoundsException e) {

                System.out.println("Ошибка: Индекс выходит за пределы массива. Попробуйте снова.");
            } catch (Exception e) {

                System.out.println("Ошибка: Некорректный ввод. Попробуйте снова.");
                scanner.next();
            }
        }


        scanner.close();
    }
}

