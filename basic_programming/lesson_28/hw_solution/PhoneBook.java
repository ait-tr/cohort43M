package code.HomeWork.Phonebook;

import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();


        addContact(phoneBook, "Edik", "786-456-7890");
        addContact(phoneBook, "White", "786-567-8901");
        addContact(phoneBook, "Black", "785-678-9012");
    }


    public static void addContact(HashMap<String, String> phoneBook, String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Добавлен контакт: " + name + " - " + phoneNumber);
        printPhoneBook(phoneBook);
    }


    public static void printPhoneBook(HashMap<String, String> phoneBook) {
        System.out.println("Текущая телефонная книга:");
        for (HashMap.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(); 
    }
}