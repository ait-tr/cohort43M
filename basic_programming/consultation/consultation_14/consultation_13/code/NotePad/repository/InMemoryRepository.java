package consultation_13.code.NotePad.repository;

import consultation_13.code.NotePad.entity.Task;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {
    public Task add(Task newTask);

    public List<Task> findAll();

    public Optional<Task> findById(Integer id);

    public List<Task> findByName(String name);
}
