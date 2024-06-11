package HomeWork.Task3;
//Задача "Парсинг чисел": Создайте программу, которая запрашивает у
// пользователя строку и пытается преобразовать её в целое число с помощью
// Integer.parseInt(). Используйте обработку исключений для перехвата
// NumberFormatException, если введённая строка не может быть преобразована
// в число, и выводите соответствующее сообщение.

import java.util.Scanner;

public class Parsing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while(!validInput){
            try{
                System.out.println("Введите строку для преобразования в целое число");
                String input = sc.nextLine();

                number = Integer.parseInt(input);
                validInput = true;
                System.out.println("Преобразованное число: "+ number);
            }catch(NumberFormatException e){
                System.out.println("Некорректный ввод.Пожалуйста введите корректное целое число.");
            }
        }
        sc.close();
    }
}
