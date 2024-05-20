package code.HomeWork1;

import java.util.*;

public class MethodsHashMapApp {
    private HashMap<String, List<String>> methods;

    public MethodsHashMapApp() {
        methods = new HashMap<>();
    }

    public MethodsHashMapApp(HashMap<String, List<String>> methods) {
        this.methods = methods;
    }

    public void addDescription(String methodName, String description) {
        methods.putIfAbsent(methodName, new ArrayList<>());
        methods.get(methodName).add(description);
    }

    public List<String> getDescription(String methodName) {
        return methods.get(methodName);
    }

    public static void main(String[] args) {
        MethodsHashMapApp app = new MethodsHashMapApp();
        app.addDescription("put", "put(K key, V value): Добавляет пару \"ключ-значение\" в карту. Если ключ уже существует, значение будет обновлено.");
        app.addDescription("get", "get(Object key): Возвращает значение, связанное с указанным ключом. Если ключ не найден, возвращает null.");
        app.addDescription("remove", "remove(Object key): Удаляет элемент по ключу.");
        app.addDescription("containsKey", "containsKey(Object key): Проверяет наличие указанного ключа в карте.");
        app.addDescription("containsValue", "containsValue(Object value): Проверяет наличие указанного значения в карте.");
        app.addDescription("size", "size(): Возвращает количество пар \"ключ-значение\" в карте.");
        app.addDescription("isEmpty", "isEmpty(): Проверяет, пуста ли карта.");
        app.addDescription("clear", "clear(): Удаляет все элементы из карты.");
        app.addDescription("keySet", "keySet(): Возвращает набор всех ключей в карте.");
        app.addDescription("values", "values(): Возвращает коллекцию всех значений в карте.");
        app.addDescription("entrySet", "entrySet(): Возвращает набор всех пар \"ключ-значение\" в карте.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nРазмер HashMap: " + app.methods.size());
        System.out.println("\nКлючи HashMap: " + app.methods.keySet());

        while (true) {
            System.out.print("\nВведите название метода HashMap (или 'exit' для выхода): ");
            String methodName = scanner.nextLine();

            if (methodName.equalsIgnoreCase("exit")) {
                break;
            }
            List<String> description = app.getDescription(methodName);
            if (description != null) {
                System.out.println("\nОписание для метода \"" + methodName + "\": " + description);
            } else {
                System.out.println("\nОписание для метода \"" + methodName + "\" не найдено.");
            }
        }
    }
}