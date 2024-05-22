//Телефонная книга
//Создайте простую телефонную книгу, используя HashMap, где ключом будет имя контакта,
// а значением — его номер телефона. Добавьте насколько контактов и распечатайте данные после каждого добавления.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {

        Map<String,String> phoneBook = new HashMap<>();



            Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*** Для выхода введите Q ");

            System.out.println("Введите имя: ");

            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("q")) {
                break;
            }


            System.out.println("Введите номер телефона: ");
            String phoneNumber = scanner.nextLine();

            phoneBook.put(name, phoneNumber);

            System.out.println(phoneBook);

        }





    }
}
