package code.projectApp.repository;

import code.projectApp.entity.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TaskInMemoryRepository implements InMemoryRepository{

    private List<Task> tasks;
    private int taskId = 0;

    public TaskInMemoryRepository(){
        this.tasks = new ArrayList<>();
    }

    @Override
    public Task add(Task task) {
        task.setId(++taskId);
        tasks.add(task);
        return task;
    }

    @Override
    public Optional<Task> findById(Integer id) {
        for (Task task : tasks){
            if (task.getId().equals(id)){
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Task> findByName(String taskName) {
        for (Task task : tasks){
            if (task.getTaskName().equals(taskName)){
                return Optional.of(task);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Task> findAll() {
        return tasks;
    }
}
