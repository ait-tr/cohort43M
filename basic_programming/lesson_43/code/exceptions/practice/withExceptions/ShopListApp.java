package code.exceptions.practice.withExceptions;

import code.library.var1.UserInput;

import java.util.InputMismatchException;
import java.util.List;

public class ShopListApp {
    public static void main(String[] args) {
        ValidationService validationService = new ValidationService();
        ProductService productService = new ProductService(validationService);

        UserInput userInput = new UserInput();

        while (true){

            try {
                System.out.println("Введите данные нового продукта: ");
                String name = userInput.inputText("Введите название продукта: ");
                Double price = userInput.inputDouble("Введите цену продукта: ");

                Product product = new Product(name, price);
                List<String> serviceResult = productService.add(product);
                System.out.println(serviceResult);
                System.out.println("-------------------------");
            } catch (ProductValidationException exception){
                System.out.println("Product data validation failed!");
                System.out.println(exception.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Incorrect number entered");
            } catch (InputMismatchException e){
                System.out.println("Incorrect input type entered");
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
