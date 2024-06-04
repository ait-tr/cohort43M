package code.NotePad.ui;

import code.NotePad.dto.ClientRequest;
import code.NotePad.dto.ClientResponse;
import code.NotePad.service.TaskServiceAdd;
import code.NotePad.service.TaskServiceFind;

public class UserMenu {
    private final TaskServiceAdd serviceAdd;
    private final TaskServiceFind serviceFind;

    public UserMenu(TaskServiceAdd serviceAdd, TaskServiceFind serviceFind) {
        this.serviceAdd = serviceAdd;
        this.serviceFind = serviceFind;
    }

    public void menu(){

        ClientRequest request1 = new ClientRequest("task1", "description1");
        ClientRequest request2 = new ClientRequest("task3", "description2");
        ClientRequest request3 = new ClientRequest("task3", "description3");
        ClientRequest request4 = new ClientRequest("t4", "fbgsdfhbdzhfbsdfnsdgndgszmndgzmndgmnsdgzsmnsdgmsgdzfsmzdgfndsgshngd");

        System.out.println(serviceAdd.add(request1));
        System.out.println(serviceAdd.add(request2));
        System.out.println(serviceAdd.add(request3));
        System.out.println(serviceAdd.add(request4));

        System.out.println(serviceFind.findAll());

        System.out.println(serviceFind.findById(2));
        System.out.println(serviceFind.findByName("task3"));


    }
}
