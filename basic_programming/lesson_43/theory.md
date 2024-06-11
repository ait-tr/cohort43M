### Lesson 43


###  Создание собственных исключений

Вы можете определить собственные типы исключений, наследуя класс `Exception` или `RuntimeException`. Это позволяет создавать более специфичные типы ошибок для вашего приложения.

#### Пример: Собственное исключение

```java
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new MyException("Это моё исключение.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

### Использование `throws`

Ключевое слово `throws` используется в сигнатуре метода для указания, что метод может выбросить исключение. Это требует от вызывающего кода обработать исключение или дальше пробросить его.

#### Пример с `throws`

```java
public class ThrowsExample {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Доступ запрещён.");
        } else {
            System.out.println("Доступ разрешён.");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (ArithmeticException e) {
            System.out.println("Исключение: " + e.getMessage());
        }
    }
}
```


В Java Streams API, метод `Collectors.groupingBy` используется для группировки элементов потока по заданному ключу. Этот метод позволяет собирать элементы в Map, где ключами будут результаты функции, применённой к элементам потока, а значениями - коллекции элементов, сгруппированных по этим ключам.

### Основные варианты использования `Collectors.groupingBy`

1. **Простая группировка по ключу**:

   Самый простой вариант, который группирует элементы по ключу, определенному функцией:

   ```java
   List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Edward");

   Map<Integer, List<String>> namesByLength = names.stream()
           .collect(Collectors.groupingBy(String::length));

   // namesByLength: {3=[Bob], 4=[Alice, David], 5=[Frank, David], 7=[Charlie]}
   ```

   В этом примере строки группируются по их длине. Ключами в результирующем Map будут длины строк, а значениями - списки строк соответствующей длины.

2. **Группировка по ключу с пользовательским типом коллекции**:

   Можно указать тип коллекции для значений в результирующем Map. Например, вместо использования списка (List) можно использовать множество (Set):

   ```java
   Map<Integer, Set<String>> namesByLength = names.stream()
           .collect(Collectors.groupingBy(String::length, Collectors.toSet()));

   // namesByLength: {3=[Bob], 4=[Alice, David], 5=[Frank, David], 7=[Charlie]}
   ```

3. **Группировка по ключу с преобразованием элементов**:

   Можно использовать дополнительные коллекторы для преобразования элементов в группе перед их сборкой:

   ```java
   Map<Integer, Set<Character>> namesByLength = names.stream()
           .collect(Collectors.groupingBy(String::length,
                   Collectors.mapping(name -> name.charAt(0), Collectors.toSet())));

   // namesByLength: {3=[B], 4=[A, D], 5=[F, D], 7=[C]}
   ```

   В этом примере для каждой группы по длине строк создается множество первых символов строк в этой группе.

4. **Группировка с использованием пользовательского Map**:

   Можно указать конкретную реализацию Map для хранения результатов группировки:

   ```java
   Map<Integer, List<String>> namesByLength = names.stream()
           .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

   // namesByLength: {3=[Bob], 4=[Alice, David], 5=[Frank, David], 7=[Charlie]}
   ```

   В этом примере используется `TreeMap`, что позволяет автоматически упорядочивать ключи в результирующей карте.

### Пример более сложной группировки

Рассмотрим более сложный пример группировки объектов по нескольким уровням. Допустим, у нас есть класс `Person`:

```java
class Person {
    String name;
    String city;
    int age;

    // constructor, getters, and toString()...
}
```

Создадим список людей и сгруппируем их сначала по городу, а затем по возрасту:

```java
List<Person> people = Arrays.asList(
    new Person("Alice", "New York", 30),
    new Person("Bob", "Los Angeles", 25),
    new Person("Charlie", "New York", 35),
    new Person("David", "Los Angeles", 25),
    new Person("Edward", "New York", 30)
);

Map<String, Map<Integer, List<Person>>> peopleByCityAndAge = people.stream()
        .collect(Collectors.groupingBy(Person::getCity,
                Collectors.groupingBy(Person::getAge)));

// peopleByCityAndAge: {New York={30=[Alice, Edward], 35=[Charlie]}, Los Angeles={25=[Bob, David]}}
```

В этом примере сначала идет группировка по городу, затем внутри каждой группы по городу идет дальнейшая группировка по возрасту.

### Заключение

Метод `Collectors.groupingBy` в Java Streams API является мощным инструментом для группировки элементов потока по различным критериям. Он предоставляет гибкие возможности для создания сложных и многоуровневых группировок, что делает его полезным для обработки и анализа данных.

В Java Streams API, класс `Collectors` предоставляет набор статических методов для выполнения различных операций свертки и редукции на элементах потоков. Эти методы позволяют собирать результаты выполнения операций на потоках в различные коллекции или другие структуры данных.

### Основные методы класса `Collectors`

#### 1. **toList()**
Собирает элементы потока в список (`List`):

```java
List<String> result = stream.collect(Collectors.toList());
```

#### 2. **toSet()**
Собирает элементы потока в множество (`Set`):

```java
Set<String> result = stream.collect(Collectors.toSet());
```

#### 3. **toMap()**
Собирает элементы потока в карту (`Map`). Этот метод имеет несколько перегрузок:

- Простейшая форма, принимающая функции для ключа и значения:

```java
Map<Integer, String> result = stream.collect(Collectors.toMap(String::length, Function.identity()));
```

- Форма с разрешением конфликтов:

```java
Map<Integer, String> result = stream.collect(Collectors.toMap(
    String::length,
    Function.identity(),
    (existing, replacement) -> existing
));
```

- Форма с указанием конкретной реализации карты:

```java
Map<Integer, String> result = stream.collect(Collectors.toMap(
    String::length,
    Function.identity(),
    (existing, replacement) -> existing,
    TreeMap::new
));
```

#### 4. **joining()**
Собирает элементы потока в строку. Есть три варианта:

- Простейшая форма:

```java
String result = stream.collect(Collectors.joining());
```

- С разделителем:

```java
String result = stream.collect(Collectors.joining(", "));
```

- С разделителем, префиксом и суффиксом:

```java
String result = stream.collect(Collectors.joining(", ", "[", "]"));
```

#### 5. **groupingBy()**
Группирует элементы потока по ключу. Также имеет несколько перегрузок:

- Простейшая форма:

```java
Map<Integer, List<String>> result = stream.collect(Collectors.groupingBy(String::length));
```

- С указанием коллектора для значений:

```java
Map<Integer, Set<String>> result = stream.collect(Collectors.groupingBy(String::length, Collectors.toSet()));
```

- С указанием конкретной реализации карты:

```java
Map<Integer, List<String>> result = stream.collect(Collectors.groupingBy(
    String::length,
    TreeMap::new,
    Collectors.toList()
));
```

#### 6. **partitioningBy()**
Разделяет элементы потока на две группы на основе булевого предиката:

```java
Map<Boolean, List<String>> result = stream.collect(Collectors.partitioningBy(s -> s.length() > 3));
```

#### 7. **counting()**
Считает количество элементов в потоке:

```java
long count = stream.collect(Collectors.counting());
```

#### 8. **summarizingInt(), summarizingDouble(), summarizingLong()**
Выполняет статистическое сведение для числовых данных:

```java
IntSummaryStatistics stats = stream.collect(Collectors.summarizingInt(String::length));
```

#### 9. **reducing()**
Выполняет сведение элементов с помощью заданной бинарной функции. Есть несколько форм:

- Простейшая форма:

```java
Optional<String> result = stream.collect(Collectors.reducing((s1, s2) -> s1 + s2));
```

- Форма с начальным значением:

```java
String result = stream.collect(Collectors.reducing("", (s1, s2) -> s1 + s2));
```

- Форма с преобразователем:

```java
int result = stream.collect(Collectors.reducing(0, String::length, Integer::sum));
```

#### 10. **mapping()**
Преобразует элементы с помощью функции и затем применяет другой коллектор:

```java
Set<Integer> result = stream.collect(Collectors.mapping(String::length, Collectors.toSet()));
```

#### 11. **collectingAndThen()**
Применяет коллектор, а затем преобразует результат с помощью функции:

```java
List<String> unmodifiableList = stream.collect(Collectors.collectingAndThen(
    Collectors.toList(),
    Collections::unmodifiableList
));
```

#### 12. **maxBy() и minBy()**
Находит максимальное и минимальное значение с помощью компаратора:

```java
Optional<String> longest = stream.collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
Optional<String> shortest = stream.collect(Collectors.minBy(Comparator.comparingInt(String::length)));
```

### Заключение

Класс `Collectors` в Java Streams API предоставляет множество полезных методов для обработки и сбора данных из потоков. Эти методы позволяют выполнять сложные операции свертки и группировки, делая работу с потоками мощной и гибкой.

