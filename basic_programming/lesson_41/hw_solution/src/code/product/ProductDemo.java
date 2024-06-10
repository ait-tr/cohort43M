package code.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductDemo {
    public static void main(String[] args) {

        Product product1 = new Product("Молоко","Молочка",34.50,121);
        Product product2 = new Product("Сыр","Молочка",54.25,74);
        Product product3 = new Product("Хлеб","Хлебобулочное изделие ",20.0,41);
        Product product4 = new Product("Булочка","Хлебобулочное изделие ",15.0,10);
        Product product5 = new Product("Гречка","Зерновая культара",40.50,30);
        Product product6 = new Product("Спагети","Зерновая культара",34.50,58);

        List<Product> products = Arrays.asList(product1,product2,product3,product4,product5,product6);

        List<Product> productSorted = products.stream()
                .filter(x -> x.getQuantity() > 12)
                .sorted(Comparator.comparing(Product::getPrise).reversed())
                .toList();

        System.out.println(productSorted);


        Map<String, Double> averagePriceByCategory = productSorted.stream()
                .collect(Collectors.groupingBy(
                        Product::getCategory,
                        Collectors.averagingDouble(Product::getPrise)));

        System.out.println("Средняя цена по категориям " + averagePriceByCategory);


    }
}
