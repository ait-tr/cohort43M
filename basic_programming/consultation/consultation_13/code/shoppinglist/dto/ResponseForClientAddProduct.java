package code.shoppinglist.dto;

import java.util.List;

public class ResponseForClientAddProduct {
    private Integer id;
    private List<String> errors;

    public ResponseForClientAddProduct(Integer id, List<String> errors) {
        this.id = id;
        this.errors = errors;
    }

    public Integer getId() {
        return id;
    }

    public List<String> getErrors() {
        return errors;
    }
}
