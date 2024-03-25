package HomeWork_14_Lesson.Student;

public class Student {
    private int idOfStudent;

    private String nameOfStudent;

    private String surNameOfStudent;

    private int yearOfBirth;

    private String specializationOfStudent;

    public Student(int idOfStudent, String nameOfStudent, String surNameOfStudent, int yearOfBirth, String specializationOfStudent) {
        this.idOfStudent = idOfStudent;
        this.nameOfStudent = nameOfStudent;
        this.surNameOfStudent = surNameOfStudent;
        this.yearOfBirth = yearOfBirth;
        this.specializationOfStudent = specializationOfStudent;
    }

    public int getIdOfStudent() {
        return idOfStudent;
    }

    public void setIdOfStudent(int idOfStudent) {
        this.idOfStudent = idOfStudent;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurNameOfStudent() {
        return surNameOfStudent;
    }

    public void setSurNameOfStudent(String surNameOfStudent) {
        this.surNameOfStudent = surNameOfStudent;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecializationOfStudent() {
        return specializationOfStudent;
    }

    public void setSpecializationOfStudent(String specializationOfStudent) {
        this.specializationOfStudent = specializationOfStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idOfStudent=" + idOfStudent +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", surNameOfStudent='" + surNameOfStudent + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specializationOfStudent='" + specializationOfStudent + '\'' +
                '}';


    }
    public void displayStudent(){
        System.out.println("Student{" +
                "idOfStudent=" + idOfStudent +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", surNameOfStudent='" + surNameOfStudent + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", specializationOfStudent='" + specializationOfStudent + '\'' +
                '}');
    }
public void study(){
    System.out.println(nameOfStudent + " "+ surNameOfStudent + " "+ "is study");
}
public void take_a_vacation(){
    System.out.println(nameOfStudent + " "+ surNameOfStudent + " "+"take a vacation");
}
public void pass_the_exam(){
    System.out.println(nameOfStudent + " "+ surNameOfStudent + " "+"pass the exam");
}
}
