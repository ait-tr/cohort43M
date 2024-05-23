package code.Task3;
//Создайте коллекцию уникальных элементов класса Phone { String producer, String model}
//добавьте несколько элементов. Убедитесь что отсутствуют дубликаты.


import java.util.Objects;

public class Phone {
    String producer;
    String model;

    public Phone(String producer, String model) {
        this.producer = producer;
        this.model = model;

    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(producer, phone.producer) && Objects.equals(model, phone.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model);
    }
}
