package code.shoppinglist.service;

import code.library.var1.UserInput;
import code.shoppinglist.dto.ProductDto;
import code.shoppinglist.dto.ResponseForClientAddProduct;
import code.shoppinglist.repository.ProductRepository;
import code.shoppinglist.service.util.Validation;

import java.util.List;

public class ProductService {

    private ProductRepository repository;
    private Validation validation;

    public ProductService(ProductRepository repository, Validation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ResponseForClientAddProduct addNewProduct(ProductDto productDto){
        /*
        1) отдать данные на проверку - метод Validation
        2) если валидация возвращает НЕ ПУСТОЙ список ошибок -> мы должны
        создать объект ResponseForClientAddProduct
        в который помещаем id = 0 и список ошибок
        3) если список ошибок - пуст, то
        а) обращаемся к репозиторию и передаем на сохранение данные,
        б) создаем объект ResponseForClientAddProduct в который помещаем id
        из ответа репозитория и пустой список ошибок
         */

        List<String> errors = validation.validate(productDto);
        Integer newId = 0;

        if (errors.isEmpty()) {
            newId = repository.addProduct(productDto);
        }

        return new ResponseForClientAddProduct(newId, errors);
    }
}
