package code.task2;

import code.task2.entity.Car;
import code.task2.entity.Truck;
import code.task2.service.ServiceManager;

public class ServiceApp {
    public static void main(String[] args) {
        ServiceManager manager = new ServiceManager();

        Car car = new Car("1JKHKJ765GHFJHGV", "Honda", "Civic", 2020);
        Truck truck = new Truck("2JFGJF76576JGHVJHCKJ", "Ford", "F-150", 2010);

        manager.addVehicle(car);
        manager.addVehicle(truck);

        manager.assignService(car, "Repair: Oil change");
        manager.assignService(truck, "Repair: Brake disk replacement");


        manager.changeServiceStatus(0,"Waiting details");
        manager.printServiceStatus(0);
    }
}
