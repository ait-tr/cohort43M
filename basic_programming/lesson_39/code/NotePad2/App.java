package code.NotePad2;

import code.NotePad2.repository.InMemoryRepository;
import code.NotePad2.repository.TaskMemoryRepository;
import code.NotePad2.service.*;
import code.NotePad2.service.validation.ValidationService;
import code.NotePad2.ui.UserMenu;

public class App {
    public static void main(String[] args) {

        InMemoryRepository repository = new TaskMemoryRepository();
        ValidationService validationService = new ValidationService();

        TaskServiceAdd taskServiceAdd = new TaskServiceAdd(repository,validationService);
        TaskServiceFind taskServiceFind = new TaskServiceFind(repository);
        TaskServiceDelete taskServiceDelete = new TaskServiceDelete(repository);

        UserMenu userMenu = new UserMenu(taskServiceAdd,taskServiceFind,taskServiceDelete);

        userMenu.menu();


    }
}
