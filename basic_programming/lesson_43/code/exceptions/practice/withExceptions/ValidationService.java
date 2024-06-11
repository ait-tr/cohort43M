package code.exceptions.practice.withExceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationService {

    /*
    проверка на:
    - продукт не null
    - длина названия продукта не менее 3 символов
    - название состоит не только из пробелов
    - цена не null
    - цена продукта должна быть > 0
     */

    public List<String> validate(Product product){
        List<String> errorMessages = new ArrayList<>();

        if (product == null) {

            errorMessages.add("product is null");

        } else {

            if (product.getName() == null) {
                errorMessages.add("product name is null");

            } else {

                if (product.getName().length() < 3) {
                    errorMessages.add("product name length less than 3");
                }

                if (product.getName().isBlank()) {
                    errorMessages.add("product name is blank");
                }
            }

            if (product.getPrice() == null) {
                errorMessages.add("product price is null");
            } else {
                if (product.getPrice() < 0) {
                    errorMessages.add("product price less than 0");
                }
            }

        }
        return errorMessages;
    }
}
