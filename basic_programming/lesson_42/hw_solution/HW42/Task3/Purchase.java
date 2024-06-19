package code.HW42.Task3;

public class Purchase {
    private String name;
    private Double price;

    public Purchase(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
