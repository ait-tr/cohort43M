package code;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,String> telBook = new HashMap<>();

        telBook.put("Masha","12345678");
        telBook.put("Petya","34587668324");
        telBook.put("Oleg","345234524");
        telBook.put("Dima","7345625");
        telBook.put("Genrich","9563724");

        // --------- как нам пройтись по всей коллекции и посмотреть каждый элемент ? -----

        // --- вариант 1------

        Set<String> ourKeySet = telBook.keySet();
        System.out.println(ourKeySet);

        for (String currentKey : ourKeySet){
            System.out.println("Ключ = " + currentKey + ", Значение которое мы получаем из нашей коллекции Map = " + telBook.get(currentKey));
        }

        System.out.println("---------------------");

        // --- вариант 2------

        for (String currentValue : telBook.values()){
            System.out.println( "Значение которое мы получаем из набора всех значений нашей коллекции Map = " + currentValue);
        }

        // --------- вариант 3 ------



    }
}

