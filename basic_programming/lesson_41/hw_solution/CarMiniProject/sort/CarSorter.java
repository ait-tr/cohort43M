package sort;

import entity.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarSorter {
    public static List<Car> sortByPrice(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getPrice))
                .collect(Collectors.toList());
    }

    public static List<Car> sortByRating(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparingDouble(Car::getRating).reversed())
                .collect(Collectors.toList());
    }

    public static List<Car> sortByYear(List<Car> cars) {
        return cars.stream()
                .sorted(Comparator.comparingInt(Car::getYearOfManufacture))
                .collect(Collectors.toList());
    }
}
