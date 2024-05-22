package code.setClassic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample3 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("One");
        strings.add("Two");
        strings.add("Four");
        strings.add("Ten");
        strings.add("One");
        strings.add("Ten");
        strings.add("Four");


        System.out.println(strings);

        List<String> newUniqList = new ArrayList<>();

        for (String currentElement : strings) {
            if (!newUniqList.contains(currentElement)){
                newUniqList.add(currentElement);
            }
        }

        System.out.println(newUniqList);

        // ----------- альтернативный вариант ------

        Set<String> setUniqElement = new HashSet<>();

        for (String currentElement : strings) {
            setUniqElement.add(currentElement);
        }

        System.out.println(setUniqElement);

        // ----------  еще более простой вариант -----

        Set<String> setUniqElementEasy = new HashSet<>(strings);

        System.out.println(setUniqElementEasy);

        List<String> listUniq = new ArrayList<>(setUniqElementEasy);

        System.out.println(listUniq);


        System.out.println(strings);
    }
}
