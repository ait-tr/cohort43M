package code.functionalInterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StringSort {
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

//        Collections.sort(myList);
//
//        System.out.println(myList);

        // STEP 1

//        StringLengthComparator comparator = new StringLengthComparator();
//        Collections.sort(myList,comparator);
//        System.out.println(myList);
//
        // STEP 2

//        Collections.sort(myList,new StringLengthComparator());
//        System.out.println(myList);

        //STEP 3

        Comparator<String> myComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        Collections.sort(myList, myComparator);
        System.out.println(myList);



    }
}
