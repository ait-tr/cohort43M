package code.projectApp.userMenu;

import code.projectApp.dto.ClientRequest;
import code.projectApp.dto.ClientRequestForSearch;
import code.projectApp.service.TaskServiceAddAndUpdate;
import code.projectApp.service.TaskServiceFind;
import code.projectApp.service.validation.ValidationException;

public class UserMenu {
    private final TaskServiceAddAndUpdate taskServiceAddAndUpdate;
    private final TaskServiceFind taskServiceFind;

    public UserMenu(TaskServiceAddAndUpdate taskServiceAddAndUpdate, TaskServiceFind taskServiceFind) {
        this.taskServiceAddAndUpdate = taskServiceAddAndUpdate;
        this.taskServiceFind = taskServiceFind;
    }

    public void menu(){

        try{

            ClientRequest request1 = new ClientRequest("task1", "description 1");
            ClientRequest request2 = new ClientRequest("task2", "description 2");
            ClientRequest request3 = new ClientRequest("task3", "description 3");
            ClientRequest request4 = new ClientRequest("t3", "description description description description description description");

            taskServiceAddAndUpdate.add(request1);
            taskServiceAddAndUpdate.add(request2);
            taskServiceAddAndUpdate.add(request3);
            taskServiceAddAndUpdate.add(request4);

            System.out.println(taskServiceFind.findAll());

            ClientRequestForSearch<String> requestForSearch1 = new ClientRequestForSearch<>("");
            ClientRequestForSearch<String> requestForSearch2 = new ClientRequestForSearch<>("task2");
            Integer idForSearch3 = 1;

            System.out.println("------- поиск по id -----");
            System.out.println(taskServiceFind.findById(idForSearch3));


            System.out.println("------- поиск по task name -----");
            System.out.println(taskServiceFind.findByName(requestForSearch1));
            System.out.println(taskServiceFind.findByName(requestForSearch2));


        } catch (ValidationException e){
            System.out.println(e.getMessage());
        }
    }
}
