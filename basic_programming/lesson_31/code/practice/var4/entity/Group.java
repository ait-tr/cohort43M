package code.practice.var4.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    List<Student> studentsByGroup;

    public Group(String groupId) {
        this.groupId = groupId;
        this.studentsByGroup = new ArrayList<>();
    }

    public String getGroupId() {
        return groupId;
    }

    public List<Student> getStudentsByGroup() {
        return studentsByGroup;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupId='" + groupId + '\'' +
                ", studentsByGroup=" + studentsByGroup +
                '}';
    }
}
