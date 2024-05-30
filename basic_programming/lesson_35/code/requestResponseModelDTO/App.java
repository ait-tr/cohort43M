package code.requestResponseModelDTO;

import code.library.var1.UserInput;
import code.requestResponseModelDTO.repository.ProductRepository;
import code.requestResponseModelDTO.service.ProductService;
import code.requestResponseModelDTO.userInterface.UserInterface;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        UserInput userInput = new UserInput();
        UserInterface userInterface = new UserInterface(service, userInput);

        userInterface.start();
    }
}
