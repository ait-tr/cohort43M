import entity.Car;
import repository.CarRepository;
import service.CarService;

import java.util.List;

public class CarsDemo {
    public static void main(String[] args) {
        CarRepository carRepository = new CarRepository();
        CarService carService = new CarService(carRepository);

        carService.addCar(new Car("VIN123", "Toyota", "Camry", 2020, 25000.0, 4.5));
        carService.addCar(new Car("VIN456", "Honda", "Accord", 2019, 22000.0, 4.3));
        carService.addCar(new Car("VIN789", "Ford", "Mustang", 2021, 35000.0, 4.8));
        carService.addCar(new Car("VIN012", "Chevrolet", "Malibu", 2018, 20000.0, 4.2));
        carService.addCar(new Car("VIN345", "Nissan", "Altima", 2017, 18000.0, 4.1));
        carService.addCar(new Car("VIN678", "BMW", "3 Series", 2022, 42000.0, 4.9));
        carService.addCar(new Car("VIN901", "Audi", "A4", 2021, 39000.0, 4.7));

        // Initial list of cars
        System.out.println("Initial list of cars:");
        List<Car> allCars = carService.getAllCars();
        allCars.forEach(car -> System.out.println(car.toString()));

        // Updating car rating
        carService.rateCar("VIN456", 4.6);
        Car ratedCar = carService.getCar("VIN456");
        if (ratedCar != null) {
            System.out.println("New rating: " + ratedCar.getRating());
        }

        // List of cars after rating change
        System.out.println("List of cars after rating change:");
        allCars = carService.getAllCars();
        allCars.forEach(car -> System.out.println(car.toString()));

        // Finding cars by brand
        List<Car> toyotaCars = carService.findCarsByBrand("Toyota");
        System.out.println("Cars of brand Toyota:");
        toyotaCars.forEach(car -> System.out.println(car.toString()));

        // Finding cars by model
        List<Car> camryCars = carService.findCarsByModel("Camry");
        System.out.println("Cars of model Camry:");
        camryCars.forEach(car -> System.out.println(car.toString()));

        // Finding cars by year
        List<Car> carsOf2021 = carService.findCarsByYear(2021);
        System.out.println("Cars of year 2021:");
        carsOf2021.forEach(car -> System.out.println(car.toString()));

        // Updating car info
        carService.updateCarInfo("VIN789", 4.9, 38000.0);
        System.out.println("Updated car info:");
        System.out.println(carService.getCar("VIN789"));

        // Removing a car
        carService.removeCar("VIN789");
        System.out.println("List of cars after removing VIN789:");
        allCars = carService.getAllCars();
        allCars.forEach(car -> System.out.println(car.toString()));

        // Sorting cars by price
        List<Car> sortedByPrice = carService.sortCarsByPrice();
        System.out.println("Cars sorted by price:");
        sortedByPrice.forEach(car -> System.out.println(car.toString()));

        // Sorting cars by rating
        List<Car> sortedByRating = carService.sortCarsByRating();
        System.out.println("Cars sorted by rating:");
        sortedByRating.forEach(car -> System.out.println(car.toString()));

        // Sorting cars by year
        List<Car> sortedByYear = carService.sortCarsByYear();
        System.out.println("Cars sorted by year of manufacture:");
        sortedByYear.forEach(car -> System.out.println(car.toString()));
    }
}
