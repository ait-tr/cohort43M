package code.rrmDTOFrendly.service;

import code.rrmDTOFrendly.dto.ResponseForClientAddNewProduct;
import code.rrmDTOFrendly.dto.ResponseProductDto;
import code.rrmDTOFrendly.dto.RequestCreateProductDto;
import code.rrmDTOFrendly.entity.Product;
import code.rrmDTOFrendly.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ResponseForClientAddNewProduct addNewProduct(RequestCreateProductDto request) {
        /*
         - проверить правильность этих данных
         - создать новый экземпляр класса Product
         - передать этот новый Product в репозиторий на запись
         */
        List<String> errors = validationData(request);

        if (!errors.isEmpty()) {
            return new ResponseForClientAddNewProduct(false,null,errors);
        }

        Product product = createNewProduct(request.getProductName(), request.getPrice(),request.getDescription());

        Product savedProduct = repository.addProduct(product);

        ResponseProductDto response = new ResponseProductDto(savedProduct.getId(), savedProduct.getProductName());

        return new ResponseForClientAddNewProduct(true, response,errors);
    }


    public List<ResponseProductDto> findAll(){

        List<ResponseProductDto> productDtoList = new ArrayList<>();

        List<Product> allProducts = repository.findAll();

        for (Product product : allProducts){
            productDtoList.add(new ResponseProductDto(product.getId(), product.getProductName()));
        }

        return productDtoList;
    }


    public ResponseProductDto findById(Integer id){
        if (id < 1) {
            return null;
        }
        Product foundedProduct = repository.findById(id);
        ResponseProductDto productDtoForReturn = new ResponseProductDto(foundedProduct.getId(), foundedProduct.getProductName());
        return productDtoForReturn;
    }


    public ResponseProductDto findByProductName(String productName){
        Product foundedProduct = repository.findByProductName(productName);
        return new ResponseProductDto(foundedProduct.getId(),foundedProduct.getProductName());
    }

//----------------------------------------------------------------------------
    private List<String> validationData(RequestCreateProductDto request) {
        List<String> errors = new ArrayList<>();

        if (request.getProductName().isBlank()) {
            errors.add("Название продукта не должно быть пустым!");
        };

        if (request.getPrice() <= 0 ) {
            errors.add("Цена продукта должна быть больше 0");
        };

        if (request.getDescription().isBlank()) {
            errors.add("Описание продукта не должно быть пустым!");
        };

        return errors;
    }

    private Product createNewProduct( String productName, Double price, String description){
        // ...
        return new Product( productName, price, description);

    }
}
