package code.polimorphism.taskPractice.entity.vehicals;

import code.polimorphism.taskPractice.entity.Engine;
import code.polimorphism.taskPractice.entity.GearShift;
import code.polimorphism.taskPractice.entity.MotorizedVehicle;

public class Car extends MotorizedVehicle {
    public Car(String model, Integer speed, Engine engine, GearShift gearShift) {
        super(model, speed, engine, gearShift);
    }


}
