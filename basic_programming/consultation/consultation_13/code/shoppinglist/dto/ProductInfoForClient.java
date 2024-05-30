package code.shoppinglist.dto;

public class ProductInfoForClient {
    private String productName;
    private String productDescription;

    public ProductInfoForClient(String productName, String productDescription) {
        this.productName = productName;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    @Override
    public String toString() {
        return "ProductInfoForClient{" +
                "productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                '}';
    }
}
