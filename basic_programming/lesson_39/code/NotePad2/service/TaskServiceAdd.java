package code.NotePad2.service;


import code.NotePad2.dto.ClientRequest;
import code.NotePad2.dto.ClientResponse;
import code.NotePad2.entity.Task;
import code.NotePad2.repository.InMemoryRepository;
import code.NotePad2.service.validation.ValidationService;

import java.util.List;

public class TaskServiceAdd {

    private final InMemoryRepository repository;
    private final ValidationService validation;
    UserInput ui = new UserInput();

    public TaskServiceAdd(InMemoryRepository repository, ValidationService validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ClientResponse<Task> add(){
        ClientRequest request = inputNewTask();
        List<String> errors = validation.checkRequest(request);

        if (errors.isEmpty()) {
            Task taskForAdd = new Task(0, request.getName(), request.getDescription());
            Task taskAfterAdd = repository.add(taskForAdd);
            return new ClientResponse<>(200, taskAfterAdd, List.of("Добавление новой задачи прошло успешно"));
        } else {
            return new ClientResponse<>(400, new Task(), errors);
        }
    }
    public ClientRequest inputNewTask(){
        String name = ui.inputText("Enter task name:");
        String description = ui.inputText("Enter task description:");

        return new ClientRequest(name, description);
    }
}
