package service;

import entity.Car;
import repository.CarRepository;
import sort.CarSorter;

import java.util.List;

public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public void removeCar(String vin) {
        carRepository.removeCar(vin);
    }

    public void updateCarInfo(String vin, Double rating, Double price) {
        carRepository.updateCarInfo(vin, rating, price);
    }

    public List<Car> findCarsByBrand(String brand) {
        return carRepository.findByMake(brand);
    }

    public List<Car> findCarsByModel(String model) {
        return carRepository.findByModel(model);
    }

    public List<Car> findCarsByYear(int year) {
        return carRepository.findByYear(year);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCar(String vin) {
        return carRepository.getCar(vin);
    }

    public void rateCar(String vin, double rating) {
        Car car = carRepository.getCar(vin);
        if (car != null) {
            car.setRating(rating);
            carRepository.updateCarInfo(vin, rating, car.getPrice());
        }
    }

    public List<Car> sortCarsByPrice() {
        return CarSorter.sortByPrice(carRepository.findAll());
    }

    public List<Car> sortCarsByRating() {
        return CarSorter.sortByRating(carRepository.findAll());
    }

    public List<Car> sortCarsByYear() {
        return CarSorter.sortByYear(carRepository.findAll());
    }
}
