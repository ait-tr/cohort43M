import java.util.Arrays;

/*
Напишите программу, которая выводит на экран информацию о вас (или выдуманном персонаже) в три строчки:
"Меня зовут ..."
"Мне ... лет"
"Я из ..."
На месте многоточий должны использоваться переменные!

 */
public class Main {
    public static void main(String[] args) {
        String name, city;
        int age;

        name = "Alex";
        city = "Luhansk";
        age = 35;

        System.out.println("My name is " + name);
        System.out.println("I'm " + age + " years old");
        System.out.println("I'm from " + city);
    }
}
