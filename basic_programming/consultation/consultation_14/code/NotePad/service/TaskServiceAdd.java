package code.NotePad.service;

import consultation_13.code.NotePad.dto.ClientRequest;
import consultation_13.code.NotePad.dto.ClientResponse;
import consultation_13.code.NotePad.entity.Task;
import code.NotePad.repository.InMemoryRepository;
import consultation_13.code.NotePad.service.validation.ValidationService;

import java.util.List;

public class TaskServiceAdd {

    private final InMemoryRepository repository;
    private final ValidationService validation;

    public TaskServiceAdd(InMemoryRepository repository, ValidationService validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ClientResponse<Task> add(ClientRequest request){
        List<String> errors = validation.checkRequest(request);

        if (errors.isEmpty()) {
            Task taskForAdd = new Task(0, request.getName(), request.getDescription());
            Task taskAfterAdd = repository.add(taskForAdd);
            return new ClientResponse<>(200, taskAfterAdd, List.of("Добавление новой задачи прошло успешно"));
        } else {
            return new ClientResponse<>(400, new Task(), errors);
        }
    }
}
