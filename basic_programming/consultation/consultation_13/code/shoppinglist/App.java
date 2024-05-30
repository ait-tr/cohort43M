package code.shoppinglist;

import code.shoppinglist.repository.ProductRepository;
import code.shoppinglist.repository.ProductRepositoryArrayList;
import code.shoppinglist.service.ProductService;
import code.shoppinglist.service.util.UserInputShoppingList;
import code.shoppinglist.service.util.Validation;
import code.shoppinglist.ui.UserInterface;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepositoryArrayList();
        Validation validation = new Validation();

        ProductService service = new ProductService(repository, validation);
        UserInputShoppingList userInputShoppingList = new UserInputShoppingList();


        UserInterface userInterface = new UserInterface(service,userInputShoppingList);

        userInterface.start();

    }
}
