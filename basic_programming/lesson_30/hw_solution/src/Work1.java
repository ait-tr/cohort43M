import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text");
        String string = scanner.nextLine();

        String[] words = string.split("\\s+");

        for (String word : words){
            stringIntegerMap.put(word, stringIntegerMap.getOrDefault(word,0) + 1);
        }
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
