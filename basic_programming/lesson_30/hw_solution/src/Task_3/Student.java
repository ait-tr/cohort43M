package Task_3;

import java.util.Set;
import java.util.TreeSet;

public class Student {
    public static void main(String[] args) {

        Set<String> nameOfStudents = new TreeSet<>();

        UserInput userInput = new UserInput();
        int numberOfStudents = userInput.inputInt("Введите количество студентов:");
        for (int i = 0; i < numberOfStudents; i++){
        String name = userInput.inputText("Введите имя студента " + (i + 1) + ":");
        nameOfStudents.add(name);
        }
        System.out.println("Список имен студентов в алфавитном порядке:");

        for (String name : nameOfStudents){
            System.out.println(name);
        }
    }
}
