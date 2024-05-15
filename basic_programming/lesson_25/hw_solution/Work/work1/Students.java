package Work.work1;

import java.util.Objects;

public class Students {

    private String name;
    private Integer age;
    private Integer academicYear;

    public Students(String name, Integer age, Integer academicYear) {
            this.name = name;
            this.age = age;
            this.academicYear = academicYear;
    }

    public String getName() {
            return name;
        }
        public Integer getAge() {
            return age;
        }
        public Integer getAcademicYear() {
            return academicYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Work.work1.Students students = (Work.work1.Students) o;
            return Objects.equals(name, students.name) && Objects.equals(age, students.age) && Objects.equals(academicYear, students.academicYear);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age, academicYear);
        }

        @Override
        public String toString() {
            return "Students{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", academicYear=" + academicYear +
                    '}';
        }
    }

