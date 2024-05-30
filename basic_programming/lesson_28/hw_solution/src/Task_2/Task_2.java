package Task_2;

import java.util.HashMap;
import java.util.Map;

public class Task_2 {
    //Задача 2: Телефонная книга
    //
    //Создайте простую телефонную книгу, используя HashMap, где ключом будет имя контакта,
    // а значением — его номер телефона.
    // Добавьте насколько контактов и распечатайте данные после каждого добавления.
    // Реализовать функцию удаления, поиска

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        String name;
        String phoneNumber;

    UserInput userInput = new UserInput();

    while (true){
        System.out.println("Our phoneBook has the following options:");
        System.out.println("1. Add contact");
        System.out.println("2. Remove contact");
        System.out.println("3. Find contact");
        System.out.println("4. Show all contacts");
        System.out.println("5. Exit");

        int userOption = userInput.inputInt("Choose one of the options: ");

        switch (userOption){

            case 1:
                name = userInput.inputText("Enter contact name: ");
                phoneNumber = userInput.inputText("Enter contact phone: ");
                phoneBook.put(name,phoneNumber);
                System.out.println("Contact added to phoneBook");
                System.out.println(phoneBook);
                break;

            case 2:
                name = userInput.inputText("Enter contact name to remove: ");
                phoneBook.remove(name);
                System.out.println("Contact removed");
                break;

            case 3:
                name = userInput.inputText("Enter contact name for search: ");
                phoneNumber = phoneBook.get(name);
                if(phoneNumber != null){System.out.println("Phone number of "+ name + " is " + phoneNumber);}
                else { System.out.println("Contact not found");}
                break;

            case 4:
                System.out.println("List of contacts: ");
                for (String key : phoneBook.keySet()){
                    System.out.println(key + " : " + phoneBook.get(key));
                }
                break;
            case 5:
                System.out.println("Exit");
                return;

            default:
                System.out.println("Invalid choice");

        }
    }

    }

}
