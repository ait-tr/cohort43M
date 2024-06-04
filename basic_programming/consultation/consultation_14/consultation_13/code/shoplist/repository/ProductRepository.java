package consultation_13.code.shoplist.repository;

import consultation_13.code.shoplist.entity.Product;
import consultation_13.code.shoplist.dto.RequestProductDto;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    public Integer addProduct(RequestProductDto productDto);
    public List<Product>  findAll();
    public Optional<Product> findById(Integer id);
    public List<Product> findByProductName(String productName);

}
