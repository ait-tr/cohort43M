package code.shoppinglist.service;

import code.shoppinglist.dto.*;
import code.shoppinglist.entity.Product;
import code.shoppinglist.repository.ProductRepository;
import code.shoppinglist.service.util.Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService {

    private ProductRepository repository;
    private Validation validation;

    public ProductService(ProductRepository repository, Validation validation) {
        this.repository = repository;
        this.validation = validation;
    }

    public ResponseForClientAddProduct addNewProduct(RequestProductDto productDto){
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


    public ResponseForClientFindByIdProduct findById(Integer id) {
        Optional<Product> productByIdOptional = repository.findById(id);
        List<String> errors = new ArrayList<>();

        if (productByIdOptional.isPresent()) {
            Product productById = productByIdOptional.get();
            ProductInfoForClient productInfoForClient = new ProductInfoForClient(productById.getProductName(), productById.getDescription());
            return new ResponseForClientFindByIdProduct(productInfoForClient, errors);
        } else {
            errors.add("Product with ID: " + id + " not found");
            ProductInfoForClient productInfoForClient = new ProductInfoForClient("", "");
            return new ResponseForClientFindByIdProduct(productInfoForClient, errors);
        }
    }


    public ResponseForClientFindAllProduct findAll(){
        List<Product> products = repository.findAll();

        List<String> errors = new ArrayList<>();
        List<ProductInfoForClient> productInfoForClients = new ArrayList<>();


        if (products.isEmpty()) {
            errors.add("No any records in the database");
        } else {
            for (Product product : products){
                productInfoForClients.add(new ProductInfoForClient(product.getProductName(),product.getDescription()));
            }
        }

        return new ResponseForClientFindAllProduct(productInfoForClients, errors);

    }

}
