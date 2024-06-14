package code.projectApp.repository;

import code.projectApp.entity.Task;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {

    public Task add(Task task);

    public Optional<Task> findById(Integer id);

    public Optional<Task> findByName(String taskName);

    public List<Task> findAll();

}
