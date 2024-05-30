package code.shoppinglist.repository;

import code.shoppinglist.dto.RequestProductDto;
import code.shoppinglist.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    public Integer addProduct(RequestProductDto productDto);
    public List<Product>  findAll();
    public Optional<Product> findById(Integer id);
    public List<Product> findByProductName(String productName);

}
