package code.practice.var2;

public class Student {

    private Integer id;
    private String name;
    private String group;

    public Student(Integer id, String name, String group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
