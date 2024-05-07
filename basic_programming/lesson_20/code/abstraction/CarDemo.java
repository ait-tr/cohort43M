package code.abstraction;

public class CarDemo {
    public static void main(String[] args) {

        SedanCar sedanCar1 = new SedanCar("Ford");
        SedanCar sedanCar2 = new SedanCar("Honda");
        SedanCar sedanCar3 = new SedanCar("Mitsubishi");

        SportCar sportCar1 = new SportCar("Maserati");
        SportCar sportCar2 = new SportCar("Lamborghini");
        SportCar sportCar3 = new SportCar("BMW M5");

        Truck truck1 = new Truck("VOLVO");
        Truck truck2 = new Truck("MAN");
        Truck truck3 = new Truck("SCAN");

        Car[] cars = {sedanCar1, sedanCar2, sedanCar3, sportCar1, sportCar2, sportCar3, truck1,truck2,truck3};

        for (int i = 0; i < cars.length; i++) {
            cars[i].printModel();
            cars[i].beep();
            cars[i].speedUp();
        }

    }
}
