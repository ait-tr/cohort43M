package code.streamGroupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Notebook", "Electronics", 999.99));
        products.add(new Product("Phone", "Electronics", 799.99));
        products.add(new Product("Jeans", "Clothing", 19.99));
        products.add(new Product("Microwave", "Home Appliance", 79.99));
        products.add(new Product("Blender", "Home Appliance", 39.99));
        products.add(new Product("Computer", "Electronics", 1999.99));


        Map<String, List<Product>> productByCategory = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory));

        System.out.println(productByCategory);


        Map<String, Double> totalCategoryPrice = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.summingDouble(Product::getPrice)));

        System.out.println(totalCategoryPrice);

        Map<String, Long> totalCategoryCounter = products.stream()
                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));

        System.out.println(totalCategoryCounter);

    }
}
