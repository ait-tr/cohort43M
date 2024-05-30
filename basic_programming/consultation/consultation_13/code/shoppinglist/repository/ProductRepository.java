package code.shoppinglist.repository;

import code.shoppinglist.dto.ProductDto;
import code.shoppinglist.entity.Product;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    public Integer addProduct(ProductDto productDto);
    public List<Product>  findAll();
    public Optional<Product> findById(Integer id);
    public List<Product> findByProductName(String productName);

}
