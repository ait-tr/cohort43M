package code.shoppinglist.service;

import code.library.var1.UserInput;
import code.shoppinglist.dto.ProductDto;
import code.shoppinglist.repository.ProductRepository;

public class ProductService {

    private ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }


    public void addNewProduct(ProductDto productDto){
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

        repository.addProduct(productDto);
    }
}
