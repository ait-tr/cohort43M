package work2;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> hashMap = new HashMap<>();

        System.out.println("Сколько вы хотите добавить контактов");

        Integer integer = scanner.nextInt();

        for (int i = 0; i < integer; i++) {
            System.out.println("Как зовут вашего контакта ?");
            String string = scanner.next();

            System.out.println("Введите номер контакта");
            Integer integer1 = scanner.nextInt();

            hashMap.put(string, integer1);

            System.out.println(hashMap);
        }










    }
}
