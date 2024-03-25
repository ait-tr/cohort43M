package Students.Student;

public class Student {

    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String specialization;

    public Student(int id, String name, String lastName, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    //учиться
    //взять отпуск
    //сдать экзамен
    public void study() {
        System.out.println(name + " is study");
    }
    public void takeAVacation() {
        System.out.println(name + " is take a vacation");
    }
    public void passTheExam() {
        System.out.println(name + " is pass the exam");
    }
    public void transferred() {
        System.out.println(name + " is transferred to another faculty");
    }
}
