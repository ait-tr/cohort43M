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

        // ---- через циклы - v 1.0 -----

        Map<String, List<Product>> productsByCategory = new HashMap<>();

        for (Product product : products) {
            String currentCategory = product.getCategory();

            if (productsByCategory.get(currentCategory) == null) {
                productsByCategory.put(currentCategory, new ArrayList<>());
            }

            List<Product> currentList = productsByCategory.get(currentCategory);
            currentList.add(product);
        }

       // System.out.println(productsByCategory);
       /*
       коллекция
       [
       "category1" = [product1, product3, product4]
       "category2" = [product2, product5, product6]
       "category3" = [product7]
       ]
        */
       for (Map.Entry<String, List<Product>> entry : productsByCategory.entrySet()){
           List<Product> productList = entry.getValue();
           Double totalPrice = 0.0;
           Integer counter = 0;
           for(Product currentProduct : productList){
               if (currentProduct.getQuantity() > quantityLimit){
                   totalPrice = totalPrice + currentProduct.getPrice();
                   counter++;
               }
           }
           avgPrices.put(entry.getKey(), (totalPrice / counter));
       }


       printAvg(avgPrices);

        System.out.println("====================================");

       // --------- циклы, но с использованием отдельного класса -----

        List<Category> categories = new ArrayList<>();

        for (Map.Entry<String, List<Product>> entry : productsByCategory.entrySet()) {
            Category newCategory = new Category(entry.getKey(),entry.getValue());
            newCategory.calculateAvgPrice(quantityLimit);
            categories.add(newCategory);
        }

        printCategoryList(categories,quantityLimit);


        System.out.println("====================================");



    }


        private static void printMap(Map<String, List<Product>> maps){
            for (Map.Entry<String, List<Product>> entry : maps.entrySet()){
                System.out.println("Категория: " + entry.getKey());
                for (Product product : entry.getValue()){
                    System.out.println(product);
                }
            }
        }

    private static void printAvg(Map<String, Double> mapsAvg){
        for (Map.Entry<String, Double> entry : mapsAvg.entrySet()){
            System.out.print("Категория: " + entry.getKey());
            System.out.print("  Средняя цена: " + entry.getValue());
            System.out.println();
        }
    }

    private static void printCategoryList(List<Category> list, Integer quantityLimit){
        for (Category category : list){
            System.out.println("Категория: " + category.getName());
            System.out.println("Средняя цена для категории: " + category.getAvgPrice());
            for (Product product : category.getProducts()){
                if (product.getQuantity() > quantityLimit) System.out.println(product);
            }
        }
    }


}
