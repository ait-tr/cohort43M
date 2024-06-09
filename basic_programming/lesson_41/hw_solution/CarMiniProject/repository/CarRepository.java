package repository;

import entity.Car;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class CarRepository {
    private final Map<String, Car> cars = new HashMap<>();

    public void addCar(Car car) {
        cars.put(car.getVin(), car);
    }

    public void removeCar(String vin) {
        cars.remove(vin);
    }

    public void updateCarInfo(String vin, Double rating, Double price) {
        cars.computeIfPresent(vin, (key, car) -> {
            car.setPrice(price);
            car.setRating(rating);
            return car;
        });
    }

    public Car getCar(String vin) {
        return cars.get(vin);
    }

    public List<Car> findAll() {
        return cars.values().stream().collect(Collectors.toList());
    }

    public List<Car> findByMake(String brand) {
        return cars.values().stream()
                .filter(car -> car.getBrand().equalsIgnoreCase(brand))
                .collect(Collectors.toList());
    }

    public List<Car> findByModel(String model) {
        return cars.values().stream()
                .filter(car -> car.getModel().equalsIgnoreCase(model))
                .collect(Collectors.toList());
    }

    public List<Car> findByYear(int year) {
        return cars.values().stream()
                .filter(car -> car.getYearOfManufacture() == year)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CarRepository{" +
                "cars=" + cars +
                '}';
    }
}
