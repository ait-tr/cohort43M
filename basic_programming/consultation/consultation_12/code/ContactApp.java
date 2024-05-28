package code;

public class ContactApp {
    public static void main(String[] args) {

        Contact contact1 = new Contact("John","+448438723653");
        Contact contact2 = new Contact("Thomas","+495642373242");
        Contact contact3 = new Contact("Ruslan","+371345374632");
        Contact contact4 = new Contact("Victor","+3809534762426");
        Contact contact5 = new Contact("Olga","+36384325362456");
        Contact contact6 = new Contact("John","+44834578345");
        Contact contact7 = new Contact("Roman","+371345374632");

        ContactManager manager = new ContactManager();

        if (manager.addContact(contact1)) {
            System.out.println("Контакт: " + contact1 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact1 + " уже существует");
        }

        if (manager.addContact(contact2)) {
            System.out.println("Контакт: " + contact2 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact2 + " уже существует");
        }
        if (manager.addContact(contact3)) {
            System.out.println("Контакт: " + contact3 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact3 + " уже существует");
        }
        if (manager.addContact(contact4)) {
            System.out.println("Контакт: " + contact4 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact4 + " уже существует");
        }
        if (manager.addContact(contact5)) {
            System.out.println("Контакт: " + contact5 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact5 + " уже существует");
        }
        if (manager.addContact(contact6)) {
            System.out.println("Контакт: " + contact6 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact6 + " уже существует");
        }
        if (manager.addContact(contact7)) {
            System.out.println("Контакт: " + contact7 + " добавлен успешно!");
        } else {
            System.out.println("Контакт: " + contact7 + " уже существует");
        }


        manager.getAllContacts();


        String searchName = "John";
        String searchPhoneNumber = "+371345374632";

        System.out.println("Contacts with name " + searchName + " are: " + manager.getContactByName(searchName));

        System.out.println("Contacts with phone number " + searchPhoneNumber + " are: " + manager.getContactByPhoneNumber(searchPhoneNumber));

        manager.removeContact(new Contact("John", "+44834578345"));
        manager.getAllContacts();


    }

}
