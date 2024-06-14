package code.projectApp;

import code.projectApp.repository.InMemoryRepository;
import code.projectApp.repository.TaskInMemoryRepository;
import code.projectApp.service.TaskServiceAddAndUpdate;
import code.projectApp.service.TaskServiceFind;
import code.projectApp.service.validation.Validation;
import code.projectApp.userMenu.UserMenu;

public class App {
    public static void main(String[] args) {
        InMemoryRepository repository = new TaskInMemoryRepository();
        Validation validation = new Validation();

        TaskServiceAddAndUpdate taskServiceAddAndUpdate = new TaskServiceAddAndUpdate(repository, validation);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);

        UserMenu menu = new UserMenu(taskServiceAddAndUpdate,taskServiceFind);

        menu.menu();
    }
}
