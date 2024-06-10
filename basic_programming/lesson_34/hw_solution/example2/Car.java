package homework.miniProject.example2;

public class Car {

    private String vin;
    private String carBrand;
    private String carModel;
    private Integer carYear;
    private double carPrice;
    private double carRating;

    private Integer ratingCount;

    public Car(String vin, String carBrand, String carModel, Integer carYear, double carPrice) {
        this.vin = vin;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrice = carPrice;
        this.carRating = 0.0;
        this.ratingCount = 0;

    }

    public String getVin() {
        return vin;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public Integer getCarYear() {
        return carYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public double getCarRating() {
        return carRating;
    }

    public Integer getRatingCount() {
        return ratingCount;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public void addRating(double carRating){
        this.carRating = (this.carRating * this.ratingCount + carRating) / (++this.ratingCount);
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carYear=" + carYear +
                ", carPrice=" + carPrice +
                ", carRating=" + carRating +
                '}';
    }
}
