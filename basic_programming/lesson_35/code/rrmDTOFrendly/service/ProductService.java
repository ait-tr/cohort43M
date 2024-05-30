package code.rrmDTOFrendly.service;

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

    public ResponseProductDto addNewProduct(RequestCreateProductDto request) {
        /*
         - проверить правильность этих данных
         - создать новый экземпляр класса Product
         - передать этот новый Product в репозиторий на запись
         */

        if (!validationData(request)) {
            return null;
        }

        Product product = createNewProduct(request.getProductName(), request.getPrice(),request.getDescription());

        Product savedProduct = repository.addProduct(product);

        ResponseProductDto response = new ResponseProductDto(savedProduct.getId(), savedProduct.getProductName());

        return response;
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
//----------------------------------------------------------------------------
    private boolean validationData(RequestCreateProductDto request) {
        if (request.getProductName().isBlank() ||
                request.getPrice() < 0 ||
                request.getDescription().isBlank()) {
            return false;
        }

        return true;
    }

    private Product createNewProduct( String productName, Double price, String description){
        // ...
        return new Product( productName, price, description);

    }
}
