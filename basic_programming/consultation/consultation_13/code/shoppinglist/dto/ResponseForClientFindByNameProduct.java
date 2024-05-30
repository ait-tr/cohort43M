package code.shoppinglist.dto;

import java.util.List;

public class ResponseForClientFindByNameProduct {
    private List<ProductInfoForClient> productsInfoForClient;
    private List<String> errors;

    public ResponseForClientFindByNameProduct(List<ProductInfoForClient> productsInfoForClient, List<String> errors) {
        this.productsInfoForClient = productsInfoForClient;
        this.errors = errors;
    }

    public List<ProductInfoForClient> getProductsInfoForClient() {
        return productsInfoForClient;
    }

    public List<String> getErrors() {
        return errors;
    }

    @Override
    public String toString() {
        return "ResponseForClientFindByNameProduct{" +
                "productsInfoForClient=" + productsInfoForClient +
                ", errors=" + errors +
                '}';
    }
}
