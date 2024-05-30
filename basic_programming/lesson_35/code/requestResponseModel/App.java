package code.requestResponseModel;

import code.library.var1.UserInput;
import code.requestResponseModel.repository.ProductRepository;
import code.requestResponseModel.service.ProductService;
import code.requestResponseModel.userInterface.UserInterface;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        UserInput userInput = new UserInput();
        UserInterface userInterface = new UserInterface(service, userInput);

        userInterface.start();
    }
}
