package code.arrayWithoutInterfaces;

public class Sklad {

    Device[] devices;


    public void fillSklad() {

        Computer computer1 = new Computer("MacBook", "MacBook Pro M1", 16, "M1");
        Computer computer2 = new Computer("Acer", "Acer computer", 17, "i5");
        Computer computer3 = new Computer("Asus", "Asus computer", 15, "i7");

        TV tv1 = new TV("LG", "LG 3401", 34, "LED");
        TV tv2 = new TV("SAMSUNG", "5250", 52, "OLED");
        TV tv3 = new TV("LG", "LG 3401", 34, "LED");
        TV tv4 = new TV("LG", "LG 3401", 34, "LED");
        TV tv5 = new TV("LG", "LG 3401", 34, "LED");

        devices = new Device[]{computer1,computer2,computer3,tv1,tv2,tv3,tv4,tv5};


    }

    public Device[] findByName(String searchName){
        Device[] foundedDevices = new Device[5]; // надо будет переделать
        int indexCounter = 0;

        for (int i = 0; i < devices.length; i++) {
            if (devices[i].getName().equals(searchName)) {
                foundedDevices[indexCounter] = devices[i];
                indexCounter++;
            }
        }

        return foundedDevices;
    }



}
