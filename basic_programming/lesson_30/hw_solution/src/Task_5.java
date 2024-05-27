import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task_5 {
    public static void main(String[] args) {
        //адача 5: Итерация по списку строк и замена слова
        //
        //Написать программу, которая создает список строк, а затем проходит по нему с
        //использованием Iterator, заменяя все вхождения слова "apple" на "orange".

        List<String> strings = new ArrayList<>();

        strings.add("apple");
        strings.add("banana");
        strings.add("mango");
        strings.add("apple");
        strings.add("lemon");
        strings.add("orange");

        System.out.println("список строк исходный : " + strings);

        ListIterator<String> listIterator = strings.listIterator();
        while (listIterator.hasNext()){

            String currentString = listIterator.next();
            if(currentString.contains("apple")){
                listIterator.set("orange");
            }
        }

        System.out.println("список строк после замены всех слоа 'apple' на 'orange' :" + strings);
    }
}
