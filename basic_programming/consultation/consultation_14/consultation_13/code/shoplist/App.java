package consultation_13.code.shoplist;

import consultation_13.code.shoplist.repository.ProductRepositoryArrayList;
import consultation_13.code.shoplist.repository.ProductRepository;
import consultation_13.code.shoplist.service.ProductService;
import consultation_13.code.shoplist.service.util.UserInputShoppingList;
import consultation_13.code.shoplist.service.util.Validation;
import consultation_13.code.shoplist.ui.UserInterface;

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
