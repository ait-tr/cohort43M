package student.model;

public class Student {

    private int id;
    private  String name;
    private String lastName;
    private int yearOfBirth;
    private String speciality;

    public Student(int id, String name, String lastName, int yearOfBirth, String speciality) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.speciality = speciality;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", speciality='" + speciality + '\'' +
                '}';
    }

    public void study(){
        System.out.println(name +" "+ lastName + " learn");
    }
    public void vacation(){
        System.out.println(name + " " + lastName + " take vacation");
    }
    public void exam(){
        System.out.println(name + " " + lastName + " take the exam");
    }
    public void beer(){
        System.out.println(name + " " + lastName + " drink beer");

    }

}
