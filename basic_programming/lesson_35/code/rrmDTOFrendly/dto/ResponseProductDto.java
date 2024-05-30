package code.rrmDTOFrendly.dto;

public class ResponseProductDto {
    private Integer id;
    private String productName;


    public ResponseProductDto(Integer id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Integer getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }


    @Override
    public String toString() {
        return "ResponseProductDto{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
