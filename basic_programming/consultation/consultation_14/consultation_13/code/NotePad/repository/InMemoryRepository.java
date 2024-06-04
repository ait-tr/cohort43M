package consultation_13.code.NotePad.repository;

import consultation_13.code.NotePad.entity.Task;

import java.util.List;
import java.util.Optional;

public interface InMemoryRepository {
    public Task add(Task newTask);

    // возвращаем список всех элементов изх нашей коллекции задач
    public List<Task> findAll();

    // Optional - потому что может быть задача с таким id а может и не быть найдена
    public Optional<Task> findById(Integer id);

    // List - потому что name не уникальный и результатов поиска может быть несколько
    public List<Task> findByName(String name);
}
