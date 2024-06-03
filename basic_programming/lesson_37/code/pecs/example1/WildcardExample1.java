package code.pecs.example1;

import java.util.Arrays;
import java.util.List;

public class WildcardExample1 {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Hello","World");
        printList(strings);

        List<Integer> integers = Arrays.asList(1,2,3,4,5);
        printList(integers);

    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
