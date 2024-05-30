package code.shoppinglist.service.util;


import code.shoppinglist.dto.RequestProductDto;

import java.util.ArrayList;
import java.util.List;

public class Validation {

    public List<String> validate(RequestProductDto productDto){
        List<String> errors = new ArrayList<>();

        if (productDto.getProductName().isBlank()) {
            errors.add("Product name validation error");
        }

        int productNameLength = productDto.getProductName().length();
        if (productNameLength < 3 || productNameLength > 25) {
            errors.add("Product name length should be between 3 and 15 chars");
        }

        if (productDto.getPrice() == null || productDto.getPrice() <= 0) {
            errors.add("Product price must be not null or be greater 0");
        }

        return errors;
    }
}
