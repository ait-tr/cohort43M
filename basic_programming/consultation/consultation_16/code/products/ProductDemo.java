package code.products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductDemo {
    public static void main(String[] args) {
        /*
        дана коллекция Product - название, категория, цена и количество

        Найти среднюю цену продуктов по каждой категории, у которых количество превышает заданное значение
        и отсортировать по убыванию цены
         */

        List<Product> products = new ArrayList<>();
        products.add(new Product("Product1","Category1", 100.0, 10));
        products.add(new Product("Product2","Category2", 200.0, 20));
        products.add(new Product("Product3","Category1", 50.0, 5));
        products.add(new Product("Product4","Category2", 30.0, 2));
        products.add(new Product("Product5","Category2", 500.0, 20));
        products.add(new Product("Product6","Category1", 300.0, 100));
        products.add(new Product("Product7","Category3", 150.0, 50));

        Integer quantityLimit = 10;

        Map<String, Double> avgPrices = new HashMap<>();

        // ---- через циклы ------



    }
}
