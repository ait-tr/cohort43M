package code.student;

public class Student {
    private String name;
    private Integer age;
    private Double avgGrade;
    private Integer Year;

    public Student(String name, Integer age, Double avgGrade, Integer year) {
        this.name = name;
        this.age = age;
        this.avgGrade = avgGrade;
        Year = year;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    public Integer getYear() {
        return Year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                ", Year=" + Year +
                '}';
    }
}
