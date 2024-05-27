package code.Hw.Task4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = -30; i <= 20; i = i+5){
            numbers.add(i);
        }
        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            int number = iterator.next();
            if (number <= 0){
                iterator.remove();
            }
        }
        System.out.println("Positive numbers: " + numbers);
    }
}
