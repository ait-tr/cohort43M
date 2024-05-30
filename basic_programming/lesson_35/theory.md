### Lesson 35

### Модель "запрос-ответ" (Request-Response)

Эта модель является одной из наиболее распространённых моделей взаимодействия клиент-сервер в веб-приложениях. 
В контексте создания приложений на Java, эта модель, как правило, реализуется с помощью различных технологий и фреймворков.

Основные компоненты модели "запрос-ответ"

    Клиент: Обычно это веб-браузер, мобильное приложение или другой тип клиента, который отправляет запросы к серверу.

    Запрос (Request): Запрос содержит информацию о ресурсе, который клиент хочет получить, или данные, которые он хочет отправить. 
   
    Сервер: Сервер принимает запросы от клиента, обрабатывает их и отправляет соответствующие ответы.

    Ответ (Response): Ответ содержит данные, которые сервер отправляет клиенту. 

    Использование модели "запрос-ответ" в контексте взаимодействия между слоями внутри backend приложения, такими как сервисный слой и слой репозитория, 
    несколько отличается от классического клиент-серверного подхода. 
    В данном случае, эта модель больше похожа на паттерн "Команда" (Command Pattern) или "Шаблон проектирования" (Design Pattern), 
    где запрос представляет собой вызов метода, а ответ — результат выполнения этого метода.



### Принцип взаимодействия между слоями

1. **Консольный интерфейс (Console Layer)**: Отвечает за взаимодействие с пользователем. Получает ввод от пользователя, выводит информацию на консоль и передает команды сервисному слою.

2. **Сервисный слой (Service Layer)**: Отвечает за бизнес-логику приложения. Обрабатывает запросы от консольного интерфейса, выполняет необходимую логику и взаимодействует с репозиторием для получения или изменения данных.

3. **Слой репозитория (Repository Layer)**: Отвечает за управление данными. В данном случае это коллекция объектов в памяти, которая выполняет роль базы данных. Репозиторий предоставляет методы для сохранения, получения и удаления данных.

### Пример кода без использования лямбда-выражений

#### 1. Модель данных

```java
public class User {
    private Long id;
    private String name;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "'}";
    }
}
```

#### 2. Слой репозитория

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> findAll() {
        return new ArrayList<User>(users);
    }

    public Optional<User> findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    public void save(User user) {
        users.add(user);
    }

    public void deleteById(Long id) {
        User userToRemove = null;
        for (User user : users) {
            if (user.getId().equals(id)) {
                userToRemove = user;
                break;
            }
        }
        if (userToRemove != null) {
            users.remove(userToRemove);
        }
    }
}
```

#### 3. Слой сервиса

```java
import java.util.List;
import java.util.Optional;

public class UserService {
    private UserRepository userRepository = new UserRepository();

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public void createUser(Long id, String name) {
        User user = new User(id, name);
        userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
```

#### 4. Консольный интерфейс

```java
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ConsoleApp {
    private static UserService userService = new UserService();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Create User");
            System.out.println("2. Get All Users");
            System.out.println("3. Get User By ID");
            System.out.println("4. Delete User");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    createUser();
                    break;
                case 2:
                    getAllUsers();
                    break;
                case 3:
                    getUserById();
                    break;
                case 4:
                    deleteUser();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void createUser() {
        System.out.print("Enter user ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.print("Enter user name: ");
        String name = scanner.nextLine();
        userService.createUser(id, name);
        System.out.println("User created successfully.");
    }

    private static void getAllUsers() {
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void getUserById() {
        System.out.print("Enter user ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        Optional<User> user = userService.getUserById(id);
        if (user.isPresent()) {
            System.out.println(user.get());
        } else {
            System.out.println("User not found.");
        }
    }

    private static void deleteUser() {
        System.out.print("Enter user ID: ");
        Long id = Long.parseLong(scanner.nextLine());
        userService.deleteUser(id);
        System.out.println("User deleted successfully.");
    }
}
```

### Объяснение взаимодействия

1. **Консольный интерфейс**: Пользователь вводит команды через консоль. Каждая команда вызывает соответствующий метод в сервисном слое.

2. **Сервисный слой**: Обрабатывает команды, выполняя бизнес-логику. Например, для создания пользователя он создает новый объект `User` и передает его в репозиторий для сохранения. 
   Для получения всех пользователей он вызывает метод репозитория `findAll` и возвращает результат в консольный интерфейс.

3. **Репозиторий**: Управляет коллекцией пользователей в памяти. Сохраняет, ищет и удаляет пользователей по запросам сервиса.

Такой подход разделяет ответственность между различными слоями приложения, делает код более структурированным и удобным для сопровождения.


### Data Transfer Object (DTO)

DTO (Data Transfer Object) — это объект, который используется для передачи данных между различными слоями приложения или между различными компонентами системы. DTO предназначен для переноса данных и не содержит никакой бизнес-логики.

### Применение DTO

DTO используется для:

1. **Передачи данных между слоями приложения**: Например, между сервисным слоем и слоем пользовательского интерфейса.
2. **Минимизации объема данных, передаваемых по сети**: DTO позволяет передавать только необходимую информацию, избегая передачи избыточных данных.
3. **Изоляции слоев приложения**: Изменения в структуре внутренних объектов не влияют на внешний интерфейс, если используется DTO.

### Пример использования DTO

#### 1. Модель данных (Entity)

Рассмотрим модель данных `User`, которая представляет сущность в базе данных.

```java
public class User {
    private Long id;
    private String name;
    private String email;  // Поле, которое не нужно передавать через DTO

    // Конструкторы, геттеры и сеттеры
}
```

#### 2. DTO для передачи данных

Определим DTO для передачи данных пользователя. DTO будет включать только те поля, которые необходимы для передачи.

```java
public class UserDTO {
    private Long id;
    private String name;

    // Конструкторы, геттеры и сеттеры

   
}
```

#### 3. Конвертер между Entity и DTO

Для преобразования между сущностью `User` и DTO `UserDTO` создадим конвертер.

```java
public class UserConverter {
    
    public static UserDTO toDTO(User user) {
        return new UserDTO(user.getId(), user.getName());
    }

    public static User toEntity(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        return user;
    }
}
```

### Заключение

DTO является важным паттерном в архитектуре приложений, так как он упрощает передачу данных между различными слоями и компонентами системы. 
В представленном примере DTO используется для передачи данных между сервисным слоем и консольным интерфейсом, что помогает изолировать внутренние структуры данных от внешних слоев и минимизировать объем передаваемых данных.


### Модификатор `final`

В Java, модификатор `final` можно использовать с переменными, методами и классами, и каждое из этих применений имеет свои особенности.

1. **Final переменные**: Когда переменная объявлена как `final`, ее значение нельзя изменить после инициализации. Это означает, что константная переменная должна быть инициализирована при объявлении или в конструкторе (в случае с полями класса). Это полезно, когда нужно сохранить неизменяемость данных и предотвратить их изменение.

   Пример для локальной переменной:
   ```java
   final int LIMIT = 5;
   // LIMIT = 10; // Это вызовет ошибку компиляции, так как значение final переменной нельзя изменить.
   ```

   Пример для поля класса:
   ```java
   public class MyClass {
       final int LIMIT;

       public MyClass() {
           LIMIT = 10; // Инициализация в конструкторе
       }
   }
   ```

2. **Final методы**: Метод, объявленный как `final`, не может быть переопределен в подклассах. Это полезно, когда вы хотите запретить изменение поведения метода в наследуемых классах.

   Пример:
   ```java
   class Base {
       final void show() {
           System.out.println("Этот метод не может быть переопределен");
       }
   }

   class Derived extends Base {
       // void show() { // Это вызовет ошибку компиляции
       //     System.out.println("Попытка переопределить final метод");
       // }
   }
   ```

3. **Final классы**: Класс, объявленный как `final`, не может быть наследован. Это полезно, когда вы хотите запретить создание подклассов для вашего класса, обеспечивая тем самым, что ваш класс останется неизменным и не будет расширен.

   Пример:
   ```java
   final class Base {
       void show() {
           System.out.println("Этот класс не может быть наследован");
       }
   }

   // class Derived extends Base { // Это вызовет ошибку компиляции
   //     ...
   // }
   ```

Использование `final` может повысить безопасность и предсказуемость кода, а также дать компилятору дополнительную информацию, которая может быть использована для оптимизации.

### Класс `Optional`

`Optional` в Java – это контейнерный класс, используемый для обработки ситуаций, когда значение может отсутствовать. Этот класс был введен в Java 8 и находится в пакете `java.util`. `Optional` помогает избежать `NullPointerException` и является более читаемым и удобным способом обработки значений, которые могут быть `null`.

### Основные методы класса `Optional`:

- `Optional.empty()`: возвращает пустой `Optional` объект.
- `Optional.of(value)`: возвращает `Optional` с не `null` значением.

- `Optional.ofNullable(value)`: возвращает `Optional`, который может содержать `null` значение.

- `isPresent()`: возвращает `true`, если значение присутствует.
- `get()` : используется для получения значения, содержащегося в объекте Optional, но его следует использовать с осторожностью, так как он бросает исключение

### Примеры использования `Optional`:

**1. Создание `Optional` объектов:**

```java
Optional<String> optionalEmpty = Optional.empty();
Optional<String> optionalOf = Optional.of("Hello");
Optional<String> optionalNullable = Optional.ofNullable(null);
```

**2. Проверка наличия значения:**

```java
if (optionalOf.isPresent()) {
    System.out.println("Значение присутствует");
} else {
    System.out.println("Значение отсутствует");
}
```

**3. Использование `ifPresent`:**

```java
optionalOf.ifPresent(name -> System.out.println("Значение: " + name));
```

**4. Использование `orElse` и `orElseGet`:**

```java
String nullName = null;
String name = Optional.ofNullable(nullName).orElse("default name");
System.out.println(name);

name = Optional.ofNullable(nullName).orElseGet(() -> "generated name");
System.out.println(name);
```

**5. Использование `orElseThrow`:**

```java
String result = Optional.ofNullable(nullName).orElseThrow(IllegalArgumentException::new);
```

В этом примере, если `nullName` окажется `null`, будет выброшено исключение `IllegalArgumentException`.

Использование `Optional` улучшает читаемость кода и помогает избежать ошибок, связанных с обработкой `null` значений. Однако стоит избегать использования `Optional` для полей классов или в параметрах методов, так как это может увеличить сложность и не всегда является лучшей практикой.

