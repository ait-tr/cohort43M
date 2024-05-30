package code.rrmDTOFrendly;

import code.library.var1.UserInput;
import code.rrmDTOFrendly.repository.ProductRepository;
import code.rrmDTOFrendly.service.ProductService;
import code.rrmDTOFrendly.userInterface.UserInterface;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        UserInput userInput = new UserInput();
        UserInterface userInterface = new UserInterface(service, userInput);

        userInterface.start();
    }
}
