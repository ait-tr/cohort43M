package homework_42.task1;
//Фильтрация и сортировка коллекции
//Задание: Дан список строк. Необходимо отфильтровать из этого списка все строки,
//которые начинаются на букву "A" (без учёта регистра), и вернуть список этих строк,
//отсортированный в алфавитном порядке.

import java.util.Arrays;
import java.util.List;


public class ListOfStrings {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Mark","Alex","Arnold","Ben","Den","Adam","John","aaron");

//        stringList.sort(String::compareToIgnoreCase); //bad case it mutate our stringList
          System.out.println(stringList);

        List<String> stringSet = stringList.stream()

                .filter(x-> x.toLowerCase().startsWith("a"))
                .sorted(String::compareToIgnoreCase)
                .toList();

        System.out.println(stringSet);

    }

    }
