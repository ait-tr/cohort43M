package code.shoppinglist.ui;

import code.shoppinglist.dto.*;
import code.shoppinglist.service.ProductService;
import code.shoppinglist.service.util.UserInputShoppingList;

public class UserInterface {

    ProductService service;
    UserInputShoppingList userInput;

    public UserInterface(ProductService service, UserInputShoppingList userInput) {
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
                    ResponseForClientFindAllProduct products = service.findAll();
                    if (!products.getErrors().isEmpty()) {
                        for (ProductInfoForClient productDto : products.getProductInfoForClient()) {
                            System.out.println(productDto);
                    }
                    } else {
                        System.out.println(products.getErrors());
                    }
                    break;
                case 3:
                    inputIdForSearch();
                    break;
                case 4:
                    inputNameForSearch();
                    break;


                case 0:
                    System.out.println("Работа приложения завершена");
                    return;
            }
        }

    }

    private void inputNameForSearch() {
        String productName = userInput.inputText("Пока не работает");

    }

    private void inputIdForSearch() {
        int id = userInput.inputInt("Введите id продукта для поиска :");
        ResponseForClientFindByIdProduct response = service.findById(id);

        if (response.getErrors().isEmpty()) {
            System.out.println(response.getProductInfoForClient());
        } else {
            System.out.println(response.getErrors());
        }
    }

    private void inputNewProduct() {
        String productName = userInput.inputText("Введите название продукта:");
        double price = userInput.inputDouble("Введите цену продукта:");
        String productDescription = userInput.inputText("Введите описание продукта:");

        RequestProductDto request = new RequestProductDto(productName,price,productDescription);

        ResponseForClientAddProduct response = service.addNewProduct(request);

        if (response.getErrors().isEmpty()) {
            System.out.println("Ok");
            System.out.println(response.getId());
        } else {
            System.out.println(response.getErrors());
        }
    }



    private void printMenu(){
        System.out.println("1. Ввод нового продукта");
        System.out.println("2. Вывод всех продуктов");
        System.out.println("3. Поиск продукта по id");
        System.out.println("4. Поиск продукта по наименованию");

        System.out.println("0. Exit");

    }

}
