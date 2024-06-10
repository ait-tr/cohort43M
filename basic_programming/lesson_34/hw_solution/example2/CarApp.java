package homework.miniProject.example2;

public class CarApp {
    public static void main(String[] args) {

        CarDealer carDealer = new CarDealer();

        Car car1 = new Car("WBA5A7C02LFH48752", "BMW", "3 Series (G20)", 2020, 42500.00);
        Car car2 = new Car("WDDZF4JB6LA745635", "Mercedes-Benz", "C-Class (W205)", 2019, 40000.00);
        Car car3 = new Car("WAUFFAF4XKN005632", "Audi", "3A4 (B9)", 2019, 39500.00);
        Car car4 = new Car("WVWZZZAUZLP123456", "Volkswagen", "Golf (Mk8)",2020, 23000.00);
        Car car5 = new Car("WP0AB2A91LS123456", "Porsche", "911 (992)",2020, 115000.00 );
        Car car6 = new Car("W0VGM6EG0J1045628", "Opel", "Insignia (B)",2018,27000.00);
        Car car7 = new Car("5UXCR6C08L9B12345", "BMW", "X5 (G05)",2019,60000.00 );
        Car car8 = new Car("WDDZF6KB1JA123456", "Mercedes-Benz", "E-Class (W213)",2018,54000.00);
        Car car9 = new Car("WA1VAAF76KD001234", "Audi ", "Q7 (4M)",2019,55000.00);
        Car car10 = new Car("WVWZZZ3CZFE123456", "Volkswagen", "Passat (B8)",2018,25000.00);


        carDealer.addCar(car1);
        carDealer.addCar(car2);
        carDealer.addCar(car3);
        carDealer.addCar(car4);
        carDealer.addCar(car5);
        carDealer.addCar(car6);
        carDealer.addCar(car7);
        carDealer.addCar(car8);
        carDealer.addCar(car9);
        carDealer.addCar(car10);


        carDealer.rateCar("WBA5A7C02LFH48752", 8.7);
        carDealer.rateCar("WDDZF4JB6LA745635", 8.5);
        carDealer.rateCar("WAUFFAF4XKN005632", 8.6);
        carDealer.rateCar("WVWZZZAUZLP123456", 8.4);
        carDealer.rateCar("WP0AB2A91LS123456", 9.0);
        carDealer.rateCar("W0VGM6EG0J1045628", 8.2);
        carDealer.rateCar("5UXCR6C08L9B12345", 8.8);
        carDealer.rateCar("WDDZF6KB1JA123456",8.7);
        carDealer.rateCar("WA1VAAF76KD001234", 8.5);
        carDealer.rateCar("WVWZZZ3CZFE123456", 8.3);


        System.out.println("All Cars: ");
        carDealer.getAllCars().forEach(System.out::println);

        System.out.println("\nCars sorted by price: ");
        carDealer.sortCarsByPrice().forEach(System.out::println);

        System.out.println("\nCars sorted by rating: ");
        carDealer.sortCarByRating().forEach(System.out::println);

        System.out.println("\nCars sorted by year: ");
        carDealer.sortCarsByYear().forEach(System.out::println);
    }
}
