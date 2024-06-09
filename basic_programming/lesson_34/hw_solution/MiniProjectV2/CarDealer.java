package MiniProjectV2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CarDealer {
    private Map<String, Car> stock;

    public CarDealer() {
        stock = new HashMap<>();
    }

    public void addCar(Car car) {
        stock.put(car.getVin(), car);
    }

    public void deleteCar(String vin) {
        stock.remove(vin);
    }

    public void editCar(String vin, Integer newPrice, Double newRating) {
        Car car = stock.get(vin);
        if (car != null) {
            car.setPrice(newPrice);
            car.rateCar(newRating);
        }
    }
        public List<Car> searchByBrand (String brandForSearch) {
            return stock.values().stream()
                    .filter(car -> car.getBrand().equalsIgnoreCase(brandForSearch))
                    .collect(Collectors.toList());
        }

    public List<Car> searchByModel (String modelForSearch) {
        return stock.values().stream()
                .filter(car -> car.getModel().equalsIgnoreCase(modelForSearch))
                .collect(Collectors.toList());
    }
    public List<Car> searchByYear (Integer yearForSearch) {
        return stock.values().stream()
                .filter(car -> car.getYear().equals(yearForSearch))
                .collect(Collectors.toList());
    }
    public List<Car> sortByYear () {
        return stock.values().stream()
                .sorted(Comparator.comparingInt(Car::getYear))
                .collect(Collectors.toList());
    }

    public List<Car> sortByPrice () {
        return stock.values().stream()
                .sorted(Comparator.comparingInt(Car::getPrice))
                .collect(Collectors.toList());
    }
    public List<Car> sortByRate () {
        return stock.values().stream()
                .sorted(Comparator.comparingDouble(Car::getRating))
                .collect(Collectors.toList());
    }

    public void printByBrand(String brandForPrint) {
        System.out.println("Cars by brand " + brandForPrint + " :");
        searchByBrand(brandForPrint).forEach(System.out::println);
    }


    public void printAllCars() {
            stock.values().forEach(System.out::println);
    }
}
