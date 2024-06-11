package code.streamGroupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
       // Примеры методов Collectors

        List<String> strings = new ArrayList<>();

        strings.add("12");
        strings.add("23");
        strings.add("34");
        strings.add("12345");
        strings.add("1234567");


        // joining() - объединяет элементы потока в строку

        String finalResult = strings.stream()
                .collect(Collectors.joining());

        // joining(CharSequence delimiter) - объединяет элементы потока в строку с указанным разделителем

        String finalResultDelimiter = strings.stream()
                .collect(Collectors.joining(", "));


        // counting() - возвращает количество элементов в потоке

        // summarizingInt() - метод возвращает IntSummaryStatistic - может содержать различные
        // статистические данные об элементах потока


        // averagingInt() - возвращает среднее значение для целых чисел, полученных из элементов потока

        // partitioningBy(Predicate <> ) - разделяет элементы на две группы на основе предиката

        Map<Boolean, List<String>> parts = strings.stream()
                .collect(Collectors.partitioningBy(str -> str.length() > 3));

        System.out.println(parts);



    }
}
