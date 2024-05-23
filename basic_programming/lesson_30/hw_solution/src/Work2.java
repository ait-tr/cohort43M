import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number :");
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        System.out.println("Special numbers:");
        for (int number : uniqueNumbers) {
            System.out.println(number);
        }
    }

}
