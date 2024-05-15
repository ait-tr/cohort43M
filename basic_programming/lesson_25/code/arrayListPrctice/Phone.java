package code.arrayListPrctice;

public class Phone {
    private Integer id;
    private String model;
    private String producer;

    private Double price;

    public Phone(Integer id, String model, String producer, Double price) {
        this.id = id;
        this.model = model;
        this.producer = producer;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }
}
