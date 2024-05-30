package code.pesponseRequestModel.service;

import code.pesponseRequestModel.entity.Product;
import code.pesponseRequestModel.repository.ProductRepository;

import java.util.List;

public class ProductService {

    ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public boolean addNewProduct(Integer id, String productName, Double price, String description) {
        /*
         - проверить правильность этих данных
         - создать новый экземпляр класса Product
         - передать этот новый Product в репозиторий на запись
         */

        if (!validationData(id, productName, price, description)) {
            return false;
        }

        Product product = createNewProduct(id, productName, price, description);

        return repository.addProduct(product);
    }


    public List<Product> findAll(){
        return repository.findAll();
    }


//----------------------------------------------------------------------------
    private boolean validationData(Integer id, String productName, Double price, String description) {
        if (id < 0 || productName.isBlank() || price < 0 || description.isBlank()) {
            return false;
        }

        return true;
    }

    private Product createNewProduct(Integer id, String productName, Double price, String description){
        // ...
        return new Product(id, productName, price, description);

    }
}
