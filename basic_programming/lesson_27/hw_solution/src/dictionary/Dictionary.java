package dictionary;


import java.util.*;

public class Dictionary {
    public static void main(String[] args) {
        Map<String, List<String>> dictionary = new HashMap<>();

        List<String> mother = new ArrayList<>();
        mother.add("мама");
        mother.add("мать");
        addElementToList(mother,"матушка");

        List<String> father = new ArrayList<>();
        father.add("папа");
        father.add("отец");
        addElementToList(father,"батюшка");

        List<String> ok = new ArrayList<>();
        ok.add("хорошо");
        ok.add("пойдет");
        ok.add("договорились");
        addElementToList(ok,"нормально");

        List<String> stop = new ArrayList<>();
        stop.add("хватит");
        addElementToList(stop,"остановись");
        addElementToList(stop,"прекрати");

        List<String> password = new ArrayList<>();
        addElementToList(password,"пароль");
        addElementToList(password, "кодовое слово");

        dictionary.put("mother", mother);
        dictionary.put("father", father);
        dictionary.put("ok", ok);
        dictionary.put("stop", stop);
        dictionary.put("password", password);

        System.out.println(dictionary);

        System.out.println("write one of the following words (mother, father, ok, stop, password)");
        Scanner scanner = new Scanner(System.in);
        String engWord = scanner.nextLine();

        List<String> translations = dictionary.get(engWord);

        if (translations != null) {
            System.out.println("Переводы для слова '" + engWord + "': " + translations);
        } else {
            System.out.println("Переводы для слова '" + engWord + "' не найдены.");
        }

        scanner.close();

    }
    public static void addElementToList(List<String> list, String newElement) {
        list.add(newElement);
    }

}
