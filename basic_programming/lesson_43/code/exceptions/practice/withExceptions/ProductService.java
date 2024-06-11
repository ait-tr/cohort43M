package code.exceptions.practice.withExceptions;

import java.util.Arrays;
import java.util.List;

public class ProductService {

    private final ValidationService validationService;

    public ProductService(ValidationService validationService) {
        this.validationService = validationService;
    }

    public List<String> add(Product product){

        validationService.validate(product);

        return Arrays.asList("Success add new product");

    }
}
