package code.projectApp.service;

import code.projectApp.dto.ClientRequest;
import code.projectApp.dto.ClientResponse;
import code.projectApp.entity.Task;
import code.projectApp.repository.InMemoryRepository;
import code.projectApp.repository.TaskInMemoryRepository;
import code.projectApp.service.validation.Validation;

public class TaskServiceAddAndUpdate {
    private final InMemoryRepository repository;
    private final Validation validation;

    public TaskServiceAddAndUpdate(InMemoryRepository repository, Validation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ClientResponse<Task> add(ClientRequest request){
        /*
        логика работы этого метода следующая:
        1) вызываем валидацию
        если она проходит успешно - нет ошибок и НЕ ВОЗНИКАЕТ exception, то продолжается
        выполнение кода метода (создание нового такс и запись в репозиторий)
        2) если в результате валидации возникает exception, то java пытается найти обработчик
        этого исключения сперва в validation, не найдя его там поднимается по стеку вызова методов
        в наш метод add и пытается найти обработчик тут
        Поскольку его тут тоже нет, то метод add далее НЕ ВЫПОЛНЯЕТСЯ, а происходит
        переход ("возврат") в тот метод, который вызывал метод add - то есть в userMenu
        И там ищется обработчик исключения
         */

        validation.checkRequest(request);

        Task taskForAdd = new Task(request.getTaskName(),request.getTaskDescription());
        repository.add(taskForAdd);

        if (taskForAdd.getId() > 0) {
            return new ClientResponse<>(200, taskForAdd, "Добавление новой задачи прошло успешно");
        } else {
            return new ClientResponse<>(400, new Task(),"Новая задача не добавлена!");
        }
    }
}
