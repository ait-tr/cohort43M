package consultation_13.code.NotePad.service;

import consultation_13.code.NotePad.dto.ClientResponse;
import consultation_13.code.NotePad.entity.Task;
import consultation_13.code.NotePad.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class TaskServiceFind {
    private final InMemoryRepository repository;

    public TaskServiceFind(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ClientResponse<List<Task>> findAll(){

        List<Task> tasks = repository.findAll();

        if (!tasks.isEmpty()) {
            return new ClientResponse<>(200, tasks, List.of("Список задач"));
        } else {
            return new ClientResponse<>(250, tasks, List.of("База данных пуста"));
        }
    }

    public ClientResponse<Task> findById(Integer id){

        Optional<Task> foundedOptionalTask = repository.findById(id);

        if (foundedOptionalTask.isPresent()) {
            return new ClientResponse<>(200, foundedOptionalTask.get(), List.of("Найденный элемент"));
        } else {
            return new ClientResponse<>(400, new Task(), List.of("Элемент не найден"));
        }
    }

    public ClientResponse<List<Task>> findByName(String name){

        List<Task> foundedTasks = repository.findByName(name);

        if (!foundedTasks.isEmpty()) {
            return new ClientResponse<>(200, foundedTasks, List.of("Найденные элементы"));
        } else {
            return new ClientResponse<>(400, foundedTasks, List.of("Элементы не найдены"));
        }
    }
}
