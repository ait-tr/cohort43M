package code.pesponseRequestModel;

import code.library.var1.UserInput;
import code.pesponseRequestModel.repository.ProductRepository;
import code.pesponseRequestModel.service.ProductService;
import code.pesponseRequestModel.userInterface.UserInterface;

public class App {
    public static void main(String[] args) {
        ProductRepository repository = new ProductRepository();
        ProductService service = new ProductService(repository);
        UserInput userInput = new UserInput();
        UserInterface userInterface = new UserInterface(service, userInput);

        userInterface.start();
    }
}
