package code.requestResponseModel.userInterface;

import code.library.var1.UserInput;
import code.requestResponseModel.entity.Product;
import code.requestResponseModel.service.ProductService;

import java.util.List;

public class UserInterface {

    ProductService service;
    UserInput userInput;

    public UserInterface(ProductService service, UserInput userInput) {
        this.service = service;
        this.userInput = userInput;
    }

    public void start(){

        while (true){
            System.out.println();
            printMenu();
            int userChoice = userInput.inputInt("Выберите пункт меню:");

            switch (userChoice){
                case 1:
                    inputNewProduct();
                    break;
                case 2:
                    List<Product> products = service.findAll();
                    for (Product product : products){
                        System.out.println(product);
                    }
                    break;
                case 3:
                    inputIdForSearch();
                    break;
                case 4:
                    System.out.println("Работа приложения завершена");
                    return;
            }
        }

    }

    private void inputIdForSearch() {
        System.out.println("Этой опции еще нет");
    }

    private void inputNewProduct() {
        int id = userInput.inputInt("Введите id продукта:");
        String productName = userInput.inputText("Введите название продукта:");
        double price = userInput.inputDouble("Введите цену продукта:");
        String productDescription = userInput.inputText("Введите описание продукта:");

        boolean addResult = service.addNewProduct(id,productName,price,productDescription);
        if (addResult) {
            System.out.println("Ok");
        } else {
            System.out.println("Error!");
        }
    }



    private void printMenu(){
        System.out.println("1. Ввод нового продукта");
        System.out.println("2. Вывод всех продуктов");
        System.out.println("3. Поиск продукта по id");
        System.out.println("4. Exit");

    }

}
