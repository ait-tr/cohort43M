package code.shoppinglist.dto;

import java.util.List;

public class ResponseForClientFindAllProduct {
    private List<ProductInfoForClient> productInfoForClient;
    private List<String> errors;

    public ResponseForClientFindAllProduct(List<ProductInfoForClient> productInfoForClient, List<String> errors) {
        this.productInfoForClient = productInfoForClient;
        this.errors = errors;
    }

    public List<ProductInfoForClient> getProductInfoForClient() {
        return productInfoForClient;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindAllProduct{" +
                "productInfoForClient=" + productInfoForClient +
                ", errors=" + errors +
                '}';
    }
}
