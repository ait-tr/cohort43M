package HomeWork.Task2;
//Задача "Обработка пользовательского ввода": Создайте программу,
// которая запрашивает у пользователя возраст. Программа должна
// анализировать введённые данные и проверять, что возраст является
// положительным целым числом. Используйте блок try-catch для перехвата
// исключения InputMismatchException, которое может возникнуть,
// если пользователь вводит не числовые данные. В случае возникновения
// исключения, программа должна выводить сообщение о том, что введены
// некорректные данные и предлагать пользователю ввести данные заново.

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age= -1;
        while(true){
            try{
                System.out.println("Введите ваш возраст: ");
                age = sc.nextInt();
                if(age>0) {
                    System.out.println("Ваш возраст: " + age);
                    break;
                }else{
                    System.out.println("Возраст должен быть положительным числом. Попробуйте снова.");

                }
            }catch (InputMismatchException e){
                System.out.println("Некорректный ввод. Пожалуйста введите положительное целое число.");
                sc.next();
            }
        }
        sc.close();
    }
}
