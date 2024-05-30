package code.rrmDTOFrendly.repository;

import code.rrmDTOFrendly.entity.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private List<Product> database;
    private int idCounter = 0;


    public ProductRepository() {
        this.database = new ArrayList<>();
    }

    public Product addProduct(Product product){

        product.setId(++idCounter);
        boolean addResult = database.add(product);
        return product;

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
