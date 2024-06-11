package code.exceptions.practice.withExceptions;

import code.library.var1.UserInput;

import java.util.List;

public class ShopListApp {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);

        UserInput userInput = new UserInput();

        while (true){
            System.out.println("Введите данные нового продукта: ");
            String name = userInput.inputText("Введите название продукта: ");
            Double price = userInput.inputDouble("Введите цену продукта: ");

            Product product = new Product(name,price);
            List<String> serviceResult =  productService.add(product);
            System.out.println(serviceResult);
            System.out.println("-------------------------");
        }
    }
}
