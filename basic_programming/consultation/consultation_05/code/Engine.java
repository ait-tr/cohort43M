public class Engine {

    int volume;
    String type;

    public Engine(int volume, String type) {
        this.volume = volume;
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started. Type: " + type + ", Volume: " + volume + "cm3");

    }

    public void stop() {
        System.out.println("Engine stopped. Type: " + type + ", Volume: " + volume + "cm3");
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", type='" + type + '\'' +
                '}';
    }


}
