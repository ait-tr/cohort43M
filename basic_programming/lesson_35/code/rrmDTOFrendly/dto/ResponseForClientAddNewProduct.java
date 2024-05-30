package code.rrmDTOFrendly.dto;

import java.util.List;

public class ResponseForClientAddNewProduct {
    private boolean isOk;
    private ResponseProductDto response;
    private List<String> errors;

    public ResponseForClientAddNewProduct(boolean isOk, ResponseProductDto response, List<String> errors) {
        this.isOk = isOk;
        this.response = response;
        this.errors = errors;
    }

    public boolean isOk() {
        return isOk;
    }

    public ResponseProductDto getResponse() {
        return response;
    }

    public List<String> getErrors() {
        return errors;
    }
}
