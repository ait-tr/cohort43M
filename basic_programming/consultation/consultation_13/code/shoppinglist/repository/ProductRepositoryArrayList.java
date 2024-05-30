package code.shoppinglist.repository;

import code.shoppinglist.dto.RequestProductDto;
import code.shoppinglist.entity.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductRepositoryArrayList implements ProductRepository{

    private List<Product> database;

    private Integer idCounter;

    public ProductRepositoryArrayList() {
        this.database = new ArrayList<>();
        this.idCounter = 0;
    }

    @Override
    public Integer addProduct(RequestProductDto productDto) {
        idCounter++;
        database.add(new Product(idCounter,productDto.getProductName(), productDto.getPrice(),productDto.getDescription()));
        return idCounter;
    }

    @Override
    public List<Product> findAll() {
        return database;
    }

    @Override
    public Optional<Product> findById(Integer id) {
        for (Product product : database) {
            if (product.getId().equals(id)){
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Product> findByProductName(String productName) {
        List<Product> foundedProducts = new ArrayList<>();
        for (Product product : database) {
            if (product.getProductName().equals(productName)){
                foundedProducts.add(product);
            }
        }
        return foundedProducts;
    }
}
