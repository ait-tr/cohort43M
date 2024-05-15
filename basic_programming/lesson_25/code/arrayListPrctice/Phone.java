package code.arrayListPrctice;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id) && Objects.equals(model, phone.model) && Objects.equals(producer, phone.producer) && Objects.equals(price, phone.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, producer, price);
    }
}
