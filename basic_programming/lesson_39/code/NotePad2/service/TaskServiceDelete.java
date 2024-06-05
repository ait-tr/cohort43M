package code.NotePad2.service;


import code.NotePad2.entity.Task;
import code.NotePad2.repository.InMemoryRepository;

import java.util.Optional;

public class TaskServiceDelete {
    private final InMemoryRepository repository;
    UserInput ui = new UserInput();

    public TaskServiceDelete(InMemoryRepository repository) {
        this.repository = repository;
    }

    public boolean deleteById(){
        Integer id = ui.inputInt("Enter task ID for delete: ");

        Optional<Task> foundedOptionalTask = repository.findById(id);

        if (foundedOptionalTask.isPresent()) {
            return repository.delete(id);
        } else {
            return false;
        }
    }
    public boolean deleteByTask(Task task){

      //  return repository.delete(task);

        /*
        предположим что мы вызываем deleteByTask(Task task)

        для вызова мы должны передать ссылку на некий task

        2 сценария как это сделать:
        1) мы запрашиваем у пользователя id, затем ищем по id нужный task
        - то есть у нас будет ССЫЛКА НА КОНКРЕТНЫЙ ОБЪЕКТ КОТОЫЙ ХРАНИТСЯ В КОЛЛЕКЦИИ
        и не будет проблем у метода remove его удалить
        потому что сравнения объектов для удаления будет производится по ссылкам
        и затем отправляем его в метод как аргумент

        2) мы запрашиваем у пользователя id, name и description
        создаем новый task с этими параметрами и пытаемся его отправить на удаление
        ЕСЛИ в классе task не переопределен equals то удаление не произойдет

         */


        Optional<Task> foundedOptionalTask = repository.findById(task.getId());

        if (foundedOptionalTask.isPresent()) {
         //   Task foundedTask = foundedOptionalTask.get();
            return repository.delete(task);
        } else {
            return false;
        }

        /*
        1) с помощью findById мы ищем нужный объект
        2) если нашли - то давайте его удалим
        3) проблема в том ЧТО ИМЕЕНО мы отправляем в качестве аргумента в метод delete
        а мы пытаемся отправить на удаление ссылку на тот объект, которую получили на входе метода
        и тут могут быть скрытая ошибка - если этот объект был создан по сценарию 2, то удаление не произойдет

        if (foundedOptionalTask.isPresent()) {
            return repository.delete(foundedOptionalTask.get());
        } else {
            return false;
        }
         */
    }

}
