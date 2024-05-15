package code.arrayListPrctice;

import java.util.ArrayList;

public class PhoneCollectionDemo {
    public static void main(String[] args) {
        /*
        создать коллекцию телефонов
        показать что она создана и пустая
        добавить в нее один элемент
        показать что элемент добавлен
        добавить до 5 элементов
        показать коллекцию
        удалить один элемент по индексу
        удалить один элемент по объекту
         */


        ArrayList<Phone> phones = new ArrayList<>();

        System.out.println(phones);
        System.out.println(phones.size());

        phones.add(new Phone(1,"iPhone 13 Max Pro", "Apple", 1250.0));

        System.out.println(phones);
        System.out.println(phones.size());


    }
}
