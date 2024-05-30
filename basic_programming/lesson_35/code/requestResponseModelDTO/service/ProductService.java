package code.requestResponseModelDTO.service;

import code.requestResponseModelDTO.dto.ProductDto;
import code.requestResponseModelDTO.entity.Product;
import code.requestResponseModelDTO.repository.ProductRepository;

import java.util.ArrayList;
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


    public List<ProductDto> findAll(){

        List<ProductDto> productDtoList = new ArrayList<>();

        List<Product> allProducts = repository.findAll();

        for (Product product : allProducts){
            productDtoList.add(new ProductDto(product.getProductName(), product.getDescription()));
        }

        return productDtoList;
    }


    public ProductDto findById(Integer id){
        if (id < 1) {
            return null;
        }
        Product foundedProduct = repository.findById(id);
        ProductDto productDtoForReturn = new ProductDto(foundedProduct.getProductName(), foundedProduct.getDescription());
        return productDtoForReturn;
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
