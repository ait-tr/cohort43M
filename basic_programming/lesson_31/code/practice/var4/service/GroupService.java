package code.practice.var4.service;

import code.practice.var4.entity.Group;
import code.practice.var4.entity.Student;
import code.practice.var4.repository.GroupRepository;

import java.util.List;

public class GroupService {
    GroupRepository repository;

    public GroupService(GroupRepository repository) {
        this.repository = repository;
    }

    public void addNewGroup(String groupId){
        repository.addGroup(new Group(groupId));
    }

    public List<Group> findAllGroups(){
        return repository.findAll();
    }

    public Group findGroupByName(String groupName){
        return repository.findByGroupName(groupName);
    }

    public List<Student> findStudentsByGroupName(String groupName){
        return repository.allStudentsByGroup(groupName);
    }
}
