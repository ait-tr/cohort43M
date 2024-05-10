package code.task2.service;

import code.task2.entity.Vehicle;

public class ServiceManager {
    // размер количества автомобилей на одновременном ремонте
    private Vehicle[] vehicles = new Vehicle[5];

    // размер работ
    private Serviceable[] serviceables = new Serviceable[5];


    private int vehicleCounter = 0;
    private int serviceCounter = 0;

    public void addVehicle(Vehicle vehicle) {
        if (vehicleCounter < vehicles.length) {
        vehicles[vehicleCounter] = vehicle;
        vehicleCounter++;
        System.out.println("Vehicle added: ");
        vehicle.showInfo();
    } else {
            System.out.println("Service full, can't add more vehicles!");
        }
    }



    public void assignService(Vehicle vehicle, String workDescription) {
        // предположим что типы работ могут быть только "Repair" или "Paint"

        if (serviceCounter < serviceables.length) {
            if (workDescription.contains("repair")) {
                serviceables[serviceCounter] = new Repair(workDescription);
            }

            if (workDescription.contains("paint")) {
                serviceables[serviceCounter] = new Painting(workDescription);
            }

            serviceCounter++;

            System.out.println("Service started for " + vehicle.getBrand() + " " + vehicle.getModel() + " " + workDescription);

        } else {
            System.out.println("Can't assign more services, limit reached!");
        }

    }

    public void printServiceStatus(int indexMyOder) {
        System.out.println(serviceables[indexMyOder].getWorkStatus());
    }

    public void changeServiceStatus(int orderNumber, String newStatus){
        serviceables[orderNumber].changeWorkStatus(newStatus);
    }

}
