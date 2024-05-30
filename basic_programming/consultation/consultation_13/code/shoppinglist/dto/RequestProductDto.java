package code.shoppinglist.dto;

public class RequestProductDto {
    private String productName;
    private Double price;
    private String description;

    public RequestProductDto(String productName, Double price, String description) {
        this.productName = productName;
        this.price = price;
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public Double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
