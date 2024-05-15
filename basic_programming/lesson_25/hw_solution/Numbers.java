import java.util.ArrayList;
import java.util.Collections;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(56);
        numbers.add(24);
        numbers.add(89);
        numbers.add(10);
        numbers.add(33);

        System.out.println(numbers);

        int max = Collections.max(numbers);
        System.out.println("Максимальное значение: " + max);

        int min = Collections.min(numbers);
        System.out.println("Минимальное значение: " + min);

        Collections.sort(numbers);
        System.out.println("Отсортированный список: " + numbers);



    }
}
