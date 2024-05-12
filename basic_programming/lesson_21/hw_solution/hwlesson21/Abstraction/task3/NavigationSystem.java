package hwlesson21.Abstraction.task3;

abstract public class NavigationSystem {
    private String currentLocation;
    private String destination;
    abstract void startNavigation();
    abstract void stopNavigation();

    public NavigationSystem(String currentLocation, String destination) {
        this.currentLocation = currentLocation;
        this.destination = destination;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "NavigationSystem{" +
                "Current Location='" + currentLocation + '\'' +
                ",Destination='" + destination + '\'' +
                '}';
    }
}
