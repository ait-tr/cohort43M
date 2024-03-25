package Student.model;

public class Student {

    private int id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String specialization;

    //constructor


    public Student(int id, String name, String surname, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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
    public void displayStudent(){
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name + " " + surname);
        System.out.println("Birth Year: "+ yearOfBirth);
        System.out.println("Specialization: " + specialization);
    }
    public void study() {
        System.out.println(surname + " is taking a vacation.");
    }

public void takeExam (){
    System.out.println(surname + " is taking an exam.");
}


    }

