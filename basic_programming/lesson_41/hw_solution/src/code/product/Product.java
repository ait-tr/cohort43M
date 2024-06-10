package code.product;

public class Product {
    private String title;
    private String category;
    private Double prise;
    private Integer quantity;

    public Product(String title, String category, Double prise, Integer quantity) {
        this.title = title;
        this.category = category;
        this.prise = prise;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public Double getPrise() {
        return prise;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", prise=" + prise +
                ", quantity=" + quantity +
                '}';
    }
}
