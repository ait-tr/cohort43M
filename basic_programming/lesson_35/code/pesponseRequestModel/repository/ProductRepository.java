package code.pesponseRequestModel.repository;

import code.pesponseRequestModel.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> database;

    public ProductRepository() {
        this.database = new ArrayList<>();
    }

    public boolean addProduct(Product product){
        return database.add(product);
    }

    public List<Product> findAll(){
        return database;
    }

    public Product findById(Integer id){
        for (Product product : database){
            if (product.getId().equals(id)){
                return product;
            }
        }

        return null;
    }
}
