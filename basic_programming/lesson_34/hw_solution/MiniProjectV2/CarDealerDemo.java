package MiniProjectV2;

public class CarDealerDemo {
    public static void main(String[] args) {
        CarDealer dealer1= new CarDealer();

        Car car1 = new Car("JTNBE40K509112825", "Toyota","Camry", 2007,42500 );
        Car car2 = new Car("JTNBE40K509112826","Toyota", "Camry",2007,42500);
        Car car3 = new Car("JTMBE31V80D089611","Toyota", "RAV4",2012,34000);
        Car car4 = new Car("NMT543HJ546756777","Toyota", "Corolla",2006,7500);
        Car car5 = new Car("1HGFDGH3536546564","Tesla", "X",2023,120000);
        Car car6 = new Car("JNB23KL4353462585","Nissan","Almera",2016, 16000);

        dealer1.addCar(car1);
        dealer1.addCar(car2);
        dealer1.addCar(car3);
        dealer1.addCar(car4);
        dealer1.addCar(car5);
        dealer1.addCar(car6);

        dealer1.editCar("JTNBE40K509112825",38000,5.0);
        dealer1.printAllCars();

        car1.rateCar(4.8);

        System.out.println("Cars sorted by year:");
        dealer1.sortByYear().forEach(System.out::println);

        dealer1.deleteCar("1HGFDGH3536546564");


        dealer1.printByBrand("Toyota");

        car6.rateCar(3.0);


        System.out.println("Cars sorted by price:");
        dealer1.sortByPrice().forEach(System.out::println);

        System.out.println("Cars sorted by rating:");
        dealer1.sortByRate().forEach(System.out::println);

        dealer1.printByBrand("Nissan");




    }
}
