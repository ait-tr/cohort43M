package code.projectApp.service;

import code.projectApp.dto.ClientRequestForSearch;
import code.projectApp.dto.ClientResponse;
import code.projectApp.entity.Task;
import code.projectApp.repository.InMemoryRepository;

import java.util.List;
import java.util.Optional;

public class TaskServiceFind {

    private final InMemoryRepository repository;

    public TaskServiceFind(InMemoryRepository repository) {
        this.repository = repository;
    }

    public ClientResponse<List<Task>> findAll() {
        List<Task> tasks = repository.findAll();

        if (!tasks.isEmpty()) {
            return new ClientResponse<>(200, tasks,"Список задач");
            } else {
            return new ClientResponse<>(250,tasks,"База данных пустая!");
        }
    }

    public ClientResponse<Task> findById(Integer id){
        Optional<Task> foundedTaskOptional = repository.findById(id);

        if (foundedTaskOptional.isPresent()){
            return new ClientResponse<>(200, foundedTaskOptional.get(), "Найденный элемент");
        } else {
            return new ClientResponse<>(400, new Task(),"Элемент с id = " + id + " не найден");
        }
    }


    /*
    альтернативный вариант оформления метода с передачей объекта в качестве параметра
    основная идея - то что в качестве аргумента для вызова метода будет
    передаваться не Integer или String, а экземпляр параметризованного класса
    внутри которого будет находится данные, необходимые для работы нашего метода
     */

    public ClientResponse<Task> findByName(ClientRequestForSearch<String> name){
        Optional<Task> foundedTaskOptional = repository.findByName(name.getFindParam());

        if (foundedTaskOptional.isPresent()){
            return new ClientResponse<>(200, foundedTaskOptional.get(), "Найденный элемент");
        } else {
            return new ClientResponse<>(400, new Task(),"Элемент с name = " + name.getFindParam() + " не найден");
        }
    }
}
