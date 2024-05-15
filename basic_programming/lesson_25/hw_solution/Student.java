import java.util.ArrayList;
import java.util.Objects;

public class Student {
   private String name;
   private String specialisation;
   private Integer personalCode;

    public Student(String name, String specialisation, Integer personalCode) {
        this.name = name;
        this.specialisation = specialisation;
        this.personalCode = personalCode;
    }

    public String getName() {
        return name;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public Integer getPersonalCode() {
        return personalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(name, student.name) && Objects.equals(specialisation, student.specialisation) && Objects.equals(personalCode, student.personalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, specialisation, personalCode);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", specialisation='" + specialisation + '\'' +
                ", personalCode=" + personalCode +
                '}';
    }
}
