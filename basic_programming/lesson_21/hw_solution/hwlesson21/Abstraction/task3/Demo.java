package hwlesson21.Abstraction.task3;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Car");
        CarNavigationSystem carNavigationSystem = new CarNavigationSystem("Reutlingen", "Newcastle upon Tyne", 100.07);
        carNavigationSystem.startNavigation();
        System.out.println(carNavigationSystem.getBenzin());
        carNavigationSystem.stopNavigation();
        System.out.println();
        System.out.println("Marine");
        MarineNavigationSystem marineNavigationSystem = new MarineNavigationSystem("Malaga", "London", 300.7);
        marineNavigationSystem.startNavigation();
        System.out.println(marineNavigationSystem.getGasoline());
        marineNavigationSystem.stopNavigation();


    }
}
