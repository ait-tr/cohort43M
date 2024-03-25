package student;

public class Student {
    /*Создать класс Студент (Student) с приватными полями:
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
    В классе StudentAppl создать несколько студентов. Отобразить процесс учебы.*/
    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String specialization;
    private boolean isStudying;
    private boolean isOnVacation;

    public Student(int id, String name, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
        this.isStudying = isStudying;
        this.isOnVacation = isOnVacation;
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isStudying() {
        return isStudying;
    }

    public void setStudying(boolean studying) {
        isStudying = studying;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }

    public void setOnVacation(boolean onVacation) {
        isOnVacation = onVacation;
    }

    public void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name + " " + lastName);
        System.out.println("Year of birth : " + yearOfBirth);
        System.out.println("Specialization" + specialization);
    }
    public void study() {
        if (!isOnVacation) {
            isStudying = true;
            System.out.println(lastName + " is studying.");
        } else {
            System.out.println(lastName + " cannot study while on vacation.");
        }
    }

    public void takeVacation() {
        isOnVacation = true;
        System.out.println(lastName + " is on vacation.");
    }

    public void takeExam() {
        if (isStudying) {
            System.out.println(lastName + " is taking an exam.");
            // Additional logic for taking an exam
            isStudying = false; // Set studying to false after exam
        } else {
            System.out.println(lastName + " needs to study before taking an exam.");
        }
    }


}
