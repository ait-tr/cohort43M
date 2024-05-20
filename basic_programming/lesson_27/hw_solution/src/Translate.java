import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translate {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map = fillMap();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
        }
        String string = scanner.next();

        System.out.println( map.get(string));
    }
    public static Map<String, String>  fillMap (){
        Map<String, String> map = new HashMap<>();
        System.out.println("Сколько слов вы хотите добавить");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

            String word = scanner.next();
            String englishWord = scanner.next();

            map.put(word, englishWord);
        }
        return map;
    }



}
