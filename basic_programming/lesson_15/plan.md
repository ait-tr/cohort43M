# Lesson plan No. 15 03/21/2024

1. What did we learn and do in the last lesson?

OOP is the next generation programming paradigm.
Classes are...
Objects and their fields are...
Methods are...

- how to define the fields of an object in a class?

- what is an object constructor and why is it needed?

- getters and setters are...

- the toString or display method is...

OOP principles (three main ones):
- encapsulation says that...

- polymorphism; - topic of today's lesson

- inheritance.

Abstraction is another OOP principle that says...

2. Homework - analysis of problems:
- Pets class pets
- Students class

3. Topic of the lesson:

- **polymorphism;** - see the Theory section.

4. Practice:

Exercise 1.
Draw a diagram with the terms:
- Class
- Fields
- Object(s)
- Methods

Task 2.
We reinforce the skill of defining class fields and assigning them the correct data types (abstraction).

Consider the following classes:

-Company

- Tree

- ...

-User

For each of the classes, you need to define a set of 4-5 main fields, give them types and names.

Task 3.
Let's implement the BankAccount class:

- fields: account, owner, bank, branch, balance;

- we create several constructors for different needs (this is an illustration of polymorphism);

- implement the display() and display(String greeting) method (this is another illustration
  polymorphism);

- implement the deposit and withdraw methods.

---------------------------------

# План занятия №15 26.03.2024

1. Что мы узнали и сделали на прошлом занятии?

ООП - парадигма программирования следующего поколения.

ООП - это методология разработки ПО. Классы определяют структуру и поведение объектов.
Инкапсуляция позволяет скрывать детали и обеспечивать доступ к данным объекта через методы класса.

Класс - это описание характеристик объектов класса.
Объекты и их поля - это конкретный экземпляр класса.

Методы - это ...

Нарисуйте схему, на которой будут присутствовать термины:
- Класс
- Поля
- Объект(ы)
- Методы

- как определять поля объекта в классе?
  - Шаг 1: написать модификатор доступа (private - в большинстве случаев)
  - Шаг 2: выбрать тип данного (их всего 8 примитивов и String)
  - Шаг 3: придумать имя переменной
  - в конце каждой строчки надо поставить ';'

- что такое конструктор объекта и для чего он нужен?
  - конструктор собирает, "склеивает" в оперативной памяти поля в объект.
  - конструктор - это метод!, ничего не возвращает, не void, по имени совпадает с именем класса.

- геттеры и сеттеры - это методы, которые либо устанавливают значения, либо отдают. 

- метод toString или display - это методы для отображения информации об объекте.

**Принципы ООП (три главных):**
- инкапсуляция говорит о том, что объединение в классе поля и методы.
Класс - физически это ФАЙЛ с кодом, содержащим описание полей и методов.

- **полиморфизм**; - тема сегодняшнего занятия

- наследование.

Абстрагирование - это еще один принцип ООП, который говорит о том, что при создании класса надо максимально абстрагироваться от конкретных объектов, а выделить их общие свойства, нужные для решения задачи информатизации.

2. Домашнее задание - разбор задач:
- класс Pets домашние животные
- класс Students

3. Тема занятия:

- **полиморфизм;**  - см. раздел Теория.

4. Практика:

Задание 1.
Закрепляем навык определения полей класса и задания им правильных типов данных (абстрагирование).

Рассмотрим следующие классы:

- Company:
  private int id;
  private String type;
  private String name;
  private int size;
  private double turnover;
  private boolean isBankrupt;

- Tree:
  private String sort;
  private int age;
  private boolean isFruit;
  private String area;
  private double height;
  private boolean isAlive;  

- ...

- User 
  private int id;
  private String name;
  private String email;
  private String password;
  private String role;
  private boolean isActive;

Для каждого из классов необходимо определить набор из 4-5 главных полей, задать им типы и наименования.

Задание 2.
Реализуем класс BankAccount:

- поля: account, owner, bank, branch, balance;

- создаем несколько конструкторов под разные нужды (это иллюстрация полиморфизма);

- реализуем метод display() и display(String greeting) (это еще одна иллюстрация
  полиморфизма);

- реализуем методы deposit и withdraw.