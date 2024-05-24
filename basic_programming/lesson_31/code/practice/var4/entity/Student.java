package code.practice.var4.entity;

public class Student {

    private Integer id;
    private String name;
    private Group group;

    public Student(Integer id, String name, Group group) {
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

    public Group getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", groupId=" + group.getGroupId() +
                '}';
    }
}
