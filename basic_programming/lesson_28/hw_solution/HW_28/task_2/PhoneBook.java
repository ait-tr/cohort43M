import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        addContact(phoneBook, "Alice", "123-456-7890");
        addContact(phoneBook, "Bob", "234-567-8901");
        addContact(phoneBook, "Charlie", "345-678-9012");
        addContact(phoneBook, "David", "456-789-0123");
        addContact(phoneBook, "Eve", "567-890-1234");
    }

    private static void addContact(Map<String, String> phoneBook, String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Добавлен контакт: " + name + " - " + phoneNumber);
        printPhoneBook(phoneBook);
    }

    private static void printPhoneBook(Map<String, String> phoneBook) {
        System.out.println("Текущая телефонная книга:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println();
    }
}

