package code.practice.var4.repository;

import code.practice.var4.entity.Group;
import code.practice.var4.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {

    List<Group> groups;

    public GroupRepository() {
        this.groups = new ArrayList<>();
    }

    public Group addGroup(Group group){
        groups.add(group);
        return group;
    }

    public List<Group> findAll(){
        return groups;
    }

    public Group findByGroupName(String groupName){
        for (Group group : groups){
            if (group.getGroupId().equals(groupName)){
                return group;
            }
        }
        return null;
    }

    public List<Student> allStudentsByGroup(String groupName){
        Group group = findByGroupName(groupName);
        return group.getStudentsByGroup();
    }
}
