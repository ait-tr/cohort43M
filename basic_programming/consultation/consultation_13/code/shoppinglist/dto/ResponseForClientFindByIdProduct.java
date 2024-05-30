package code.shoppinglist.dto;

import java.util.List;

public class ResponseForClientFindByIdProduct {
    private ProductInfoForClient productInfoForClient;
    private List<String> errors;

    public ResponseForClientFindByIdProduct(ProductInfoForClient productInfoForClient, List<String> errors) {
        this.productInfoForClient = productInfoForClient;
        this.errors = errors;
    }

    public ProductInfoForClient getProductInfoForClient() {
        return productInfoForClient;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindByIdProduct{" +
                "productInfoForClient=" + productInfoForClient +
                ", errors=" + errors +
                '}';
    }
}
