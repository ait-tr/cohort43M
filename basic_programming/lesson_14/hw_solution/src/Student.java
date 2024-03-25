public class Student {
    private int id;
    private String name;
    private String surname;
    private int year;
    private String specialization;

    public Student(int id, String name, String surname, int year, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public void thisIs(){
        System.out.println("Id: " + id + " Name: " + name + " Surname: " + surname + " Year: " + year + " Specialization: " + specialization);
    }
    public void study(){
        System.out.println(name + " is study");
    }
    public void takeVacation(){
        System.out.println(name  + " take a vacation");
    }
    public void passTheexam(){
        System.out.println(name  + " pass the exam");
    }


}

