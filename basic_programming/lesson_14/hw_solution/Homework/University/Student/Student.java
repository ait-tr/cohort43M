package University.Student;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String specialization;

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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specialization='" + specialization + '\'' +
                '}';
    }

    public void study(){
        System.out.println(surname + " " + name + " " + yearOfBirth + " year of birth " + " specialization: " + specialization + " is studying");
    }
    public void takeAVacation(){
        System.out.println(surname + " " + name + " " + yearOfBirth + " year of birth " + " specialization: " + specialization + " take a vacation");
    }
    public void passTheExam(){
        System.out.println(surname + " " + name + " " + yearOfBirth + " year of birth " + " specialization: " + specialization + " pass the exam");
    }
    public void academicHolidays(){
        System.out.println(surname + " " + name + " " + yearOfBirth + " year of birth " + " specialization: " + specialization + " have the academic holidays");
    }
}
