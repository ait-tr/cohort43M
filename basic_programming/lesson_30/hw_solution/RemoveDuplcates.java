package homework_30.Dublikate;

import java.util.*;

public class RemoveDuplcates {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for(int i = 0; i <8 ; i++){
            numbers.add(random.nextInt(11));
        }
        System.out.println(numbers);
        System.out.println(removeDuplicates(numbers));
        }
        public static List<Integer> removeDuplicates(List<Integer> list) {
            Set<Integer> set = new HashSet<>(list);
            return new ArrayList<>(set);

        }


}
