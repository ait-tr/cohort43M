package Abstract.ver3;

public class Main {
    public static void main(String[] args) {
        NavigationSystem carNavi = new CarNavigationSystem();
        NavigationSystem marieNavi = new MarineNavigationSystem();
        carNavi.startNavigation();
        carNavi.stopNavigation();
        marieNavi.startNavigation();
        marieNavi.stopNavigation();

    }
}
