package code.polimorphism.taskPractice.entity.vehicals;

import code.polimorphism.taskPractice.entity.GearShift;
import code.polimorphism.taskPractice.entity.NonMotorizedVehicle;
import code.polimorphism.taskPractice.interfaces.GearShiftOperations;

public class BiCycle extends NonMotorizedVehicle implements GearShiftOperations {
    private GearShift gearShift;

    public BiCycle(String model, Integer speed, GearShift gearShift) {
        super(model, speed);
        this.gearShift = gearShift;
    }

    @Override
    public void changeGear(boolean isUp) {
        Integer currentGear = gearShift.getCurrentGear();

        if (isUp) {
            gearShift.setCurrentGear(currentGear + 1);
        } else {
            gearShift.setCurrentGear(currentGear - 1);
        }
    }
}
