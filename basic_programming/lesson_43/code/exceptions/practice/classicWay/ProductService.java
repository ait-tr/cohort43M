package code.exceptions.practice.classicWay;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public List<String> add(Product product){
        List<String> validationResult = validationService.validate(product);

        if (validationResult.isEmpty()) {
            return Arrays.asList("Success add new product");
        } else {
            return validationResult;
        }
    }
}
