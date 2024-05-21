package homework.task2;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {

        Map<String, String> phoneBookHashMap = new HashMap<>();

        addContact(phoneBookHashMap, "Ruslan", "123-456-7890");
        addContact(phoneBookHashMap, "Technik", "347-126-8904");
        addContact(phoneBookHashMap, "Olga", "352-555-9012");
        addContact(phoneBookHashMap, "Oleg", "987-789-2853");

    }
    public static void addContact(Map<String, String> phoneBook, String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Добавлен контакт: " + name + " - " + phoneNumber);
        printPhoneBook(phoneBook);
    }


    public static void printPhoneBook(Map<String, String> phoneBook) {
        System.out.println("Текущая телефонная книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}
