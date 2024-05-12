package hwlesson21.Abstraction.task3;

public class MarineNavigationSystem extends NavigationSystem{
    private double gasoline;

    public MarineNavigationSystem(String currentLocation, String destination, double gasoline) {
        super(currentLocation, destination);
        this.gasoline = gasoline;
    }

    public double getGasoline() {
        return gasoline;
    }

    public void setGasoline(double gasoline) {
        this.gasoline = gasoline;
    }

    @Override
    void startNavigation() {
        System.out.println("Start marine navigator: \nCurrent location: " + getCurrentLocation() + "\nDestination: " + getDestination());
    }

    @Override
    void stopNavigation() {
        System.out.println("Stop marine navigator: \nCurrent location: " + getCurrentLocation() + "\nDestination: " + getDestination());
    }

    public void gasolineLeft(){
        System.out.println("You have left " + getGasoline());
    }
}
