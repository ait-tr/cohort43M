package code.products;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;
    private Double avgPrice;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public Double getAvgPrice() {
        return avgPrice;
    }

    public void calculateAvgPrice(Integer quantityLimit){


        Double totalPrice = 0.0;
        Integer counter = 0;
        for(Product currentProduct : products){
            if (currentProduct.getQuantity() > quantityLimit){
                totalPrice = totalPrice + currentProduct.getPrice();
                counter++;
            }
        }

        this.avgPrice = totalPrice / counter;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", products=" + products +
                ", avgPrice=" + avgPrice +
                '}';
    }
}
