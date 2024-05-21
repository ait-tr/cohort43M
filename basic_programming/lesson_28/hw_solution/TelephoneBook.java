package Homework_28.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

//Телефонная книга
//Создайте простую телефонную книгу, используя HashMap, где ключом будет имя контакта,
// а значением — его номер телефона. Добавьте насколько контактов и распечатайте данные
// после каждого добавления.
public class TelephoneBook {
    private HashMap<String, String> telephoneBook;

    public TelephoneBook() {
        telephoneBook = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        telephoneBook.put(name, phoneNumber);
        System.out.println("Contact added: " + name + " - " + phoneNumber);
    }

    public void printPhoneBook() {
        System.out.println("Current phone book:");
        for (Map.Entry<String, String> entry : telephoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        TelephoneBook phoneBook = new TelephoneBook();
        Scanner scanner = new Scanner(System.in);

        
        phoneBook.addContact("Alice", "123-456-7890");
        phoneBook.printPhoneBook();

        phoneBook.addContact("Olga", "234-567-8901");
        phoneBook.printPhoneBook();

        phoneBook.addContact("Anna", "345-678-9012");
        phoneBook.printPhoneBook();

        phoneBook.addContact("Diana", "456-789-0123");
        phoneBook.printPhoneBook();

        phoneBook.addContact("Igor", "567-890-1234");
        phoneBook.printPhoneBook();

        // Запрос ввода пользователя для добавления нового контакта
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact phone number: ");
        String phoneNumber = scanner.nextLine();
        phoneBook.addContact(name, phoneNumber);
        phoneBook.printPhoneBook();

        scanner.close();
    }
}