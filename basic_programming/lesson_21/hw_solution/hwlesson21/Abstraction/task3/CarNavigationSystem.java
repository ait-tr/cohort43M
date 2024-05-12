package hwlesson21.Abstraction.task3;

public class CarNavigationSystem extends NavigationSystem{
    private double benzin;

    public CarNavigationSystem(String currentLocation, String destination, double benzin) {
        super(currentLocation, destination);
        this.benzin = benzin;
    }

    public double getBenzin() {
        return benzin;
    }

    public void setBenzin(double benzin) {
        this.benzin = benzin;
    }

    @Override
    void startNavigation() {
        System.out.println("Start car navigator: \nCurrent location: " + getCurrentLocation() + "\nDestination: " + getDestination());
    }

    @Override
    void stopNavigation() {
        System.out.println("Stop car navigator: \nCurrent location: " + getCurrentLocation() + "\nDestination: " + getDestination());
    }

    @Override
    public String toString() {
        return "CarNavigationSystem{" +
                "benzin=" + benzin +
                "} " + super.toString();
    }
    public String benzinLeft(){
        return "You have left " + getBenzin();
    }
}
