package code.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSortSpecialSolucion {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("DD");
        myList.add("FFF");
        myList.add("AAA");
        myList.add("CC");
        myList.add("BBBBBBB");
        myList.add("E");
        myList.add("HHHHHHH");

        System.out.println(myList);

        //STEP 3

//        Comparator<String> myComparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);

//        Эта форма записи равносильна:

//        Comparator<String> myComparator = new AnonymousComparator();

//        class AnonymousComparator implements Comparator<String>
//        {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        };
//

//        Collections.sort(myList, myComparator);
//        System.out.println(myList);


        //STEP 4

//        Comparator<String> myComparator = (String o1, String o2) ->
//        {
//            return o1.length() - o2.length();
//        };
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);

        /*
        "рассуждения и действия компилятора"
        1) мне сказали  Comparator<String> myComparator  - значит я должен создать
        анонимный класс который будет имплементировать интерфейс  Comparator который работает со string
        2) в этом интерфейсе есть только ОДИН метод - compare, значит код
        {
            return o1.length() - o2.length();
        } - предназначен для его переопределения
        3) у метода compare два аргумента - я буду использовать (String o1, String o2)

         */

        // STEP 5

//        Comparator<String> myComparator = (o1, o2) -> {return o1.length() - o2.length();};
//
//        Collections.sort(myList, myComparator);
//        System.out.println(myList);


        // STEP 6
            Collections.sort(myList, (o1,o2) -> o1.length() - o2.length());
            System.out.println(myList);



    }
}
