package code.shoppinglist.repository;

import code.requestResponseModelDTO.dto.ProductDto;
import code.shoppinglist.entity.Product;

import java.util.*;

/*
Возможный вариант альтернативного решения для репозитория
изменения, которые НИКАК не влияют на работу сервиса
 */
//public class ProductRepositoryMap implements ProductRepository{
//
//    private Map<Integer,Product> database;
//
//    private Integer idCounter;
//
//    public ProductRepositoryMap() {
//        this.database = new HashMap<>();
//        this.idCounter = 0;
//    }
//
//    @Override
//    public Integer addProduct(ProductDto productDto) {
//        return 0;
//    }
//
//    @Override
//    public List<Product> findAll() {
//        return List.of();
//    }
//
//    @Override
//    public Optional<Product> findById(Integer id) {
//        return Optional.empty();
//    }
//
//    @Override
//    public List<Product> findByProductName(String productName) {
//        return new ArrayList<>();
//    }
//}
