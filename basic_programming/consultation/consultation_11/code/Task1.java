package code;

import code.library.var1.UserInput;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        UserInput userInput = new UserInput();

        String name;
        String phoneNumber;

        while (true){
            System.out.println("Program menu:");
            System.out.println("1. Add contact");
            System.out.println("2. Remove contact");
            System.out.println("3. Find contact");
            System.out.println("4. Show all contacts");
            System.out.println("5. Exit");

            int userChoice = userInput.inputInt("Choose an option: ");

            switch (userChoice){
                case 1:
                    name = userInput.inputText("Enter contact name: ");
                    phoneNumber = userInput.inputText("Enter contact phone: ");
                    phoneBook.put(name,phoneNumber);
                    System.out.println("Contact added");
                    break;

                case 2:
                    name = userInput.inputText("Enter name to remove: ");
                    phoneBook.remove(name);
                    System.out.println("Contact removed");
                    break;
                case 3:
                    name = userInput.inputText("Enter name to find: ");
                    phoneNumber = phoneBook.get(name);
                    if (phoneNumber != null){
                        System.out.println("Phone : " + phoneNumber);
                    } else {
                        System.out.println("Contact not found");
                    }
                    break;
                case 4:
                    System.out.println("Contacts: ");
                    for (String key : phoneBook.keySet()){
                        System.out.println(key + " : " + phoneBook.get(key));
                    }
                    break;

                case 5:
                    System.out.println("Exit....");
                    return;

                default:
                    System.out.println("Invalid choice");

            }




        }
    }
}
