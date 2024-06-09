package MiniProjectV2;

public class Car {
    private String vin;
    private String brand;
    private String model;
    private Integer year;
    private Integer price;
    private Double rating;
    private Integer ratingCounter;

    public Car(String vin, String brand, String model, Integer year, Integer price) {
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.rating = 0.0;
        this.ratingCounter = 0;
    }

        public String getVin() {
        return vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }


    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", rating=" + rating +
                ", ratingCounter=" + ratingCounter +
                '}';
    }

    public void rateCar(Double newRating) {
        this.rating = (this.rating * this.ratingCounter + newRating)/(++this.ratingCounter);
    }
}