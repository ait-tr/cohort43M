package Student.model;
/*
Задача 2. Создать класс Студент (Student) с приватными полями:

id
имя
фамилия
год рождения
специализация
Стандартные методы:

конструктор на все поля;
геттеры и сеттеры на все поля;
метод display.
Дополнительные методы:

учиться
взять отпуск
сдать экзамен
...
В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.
 */
public class Student {
    private int id;
    private String name;
    private String lastName;
    private int age;
    private String specialization;

    public Student(int id, String name, String lastName, int age, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void displayStudent(){
        System.out.println("id: " + id + ", name: " + name + ", Last name:" + lastName + ", age: " + age + ", specialization: " + specialization);
    }

    public void study (){
        System.out.println(name + " " + lastName + " " + " is studying to " + specialization);
    }
    public void vacation () {
        System.out.println(name + " " + lastName + ", age: " + age + " took a vacation");
    }

    public void exam (){
        System.out.println("ID: " + id + " Name: " + name + " Last Name: " + lastName + " age : " + age + " Specialization: "+ specialization + " is taking an exam");
    }


}
