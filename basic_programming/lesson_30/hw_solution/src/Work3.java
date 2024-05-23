import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Work3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> students = new TreeSet<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter student :");
            String string = scanner.nextLine();
            students.add(string);
            students.stream().sorted().forEach(System.out::println);
        }

    }
}
