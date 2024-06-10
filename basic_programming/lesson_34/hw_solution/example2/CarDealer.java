package homework.miniProject.example2;

import java.util.*;
import java.util.stream.Collectors;

public class CarDealer {
    private Map<String, Car> cars;

    public CarDealer() {
        cars = new HashMap<>();
    }

    public void addCar(Car car) {
        cars.put(car.getVin(), car);
    }

    public void removeCar(String vin) {
        cars.remove(vin);
    }

    public void updateCarPrice(String vin, double newPrice) {
        Car car = cars.get(vin);

        if (car != null) {
            car.setCarPrice(newPrice);
        }
    }

    public void rateCar(String vin, double carRating) {
        Car car = cars.get(vin);

        if (car != null) {
            car.addRating(carRating);
        }
    }

    public List<Car> searchByBrand(String carBrand) {
        return cars.values().stream()
                .filter(car -> car.getCarBrand().equalsIgnoreCase(carBrand))
                .collect(Collectors.toList());
    }

    public List<Car> searchByModel(String carModel) {
        return cars.values().stream()
                .filter(car -> car.getCarModel().equalsIgnoreCase(carModel))
                .collect(Collectors.toList());
    }

    public List<Car> searchByYear(Integer carYear){
        return cars.values().stream()
                .filter(car -> car.getCarYear() == carYear)
                .collect(Collectors.toList());
    }

    public  List<Car> sortCarsByPrice(){
        return cars.values().stream()
                .sorted(Comparator.comparingDouble(Car::getCarPrice))
                .collect(Collectors.toList());
    }

    public List<Car> sortCarByRating(){
        return cars.values().stream()
                .sorted(Comparator.comparingDouble(Car::getCarRating))
                .collect(Collectors.toList());
    }

    public List<Car> sortCarsByYear(){
        return cars.values().stream()
                .sorted(Comparator.comparingInt(Car::getCarYear))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars(){
        return  new ArrayList<>(cars.values());
    }

    public List<Car> getCarsByBrand(String carBrand){
        return cars.values().stream()
                .filter(car -> car.getCarBrand().equalsIgnoreCase(carBrand))
                .collect(Collectors.toList());
    }
}
