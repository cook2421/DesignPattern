package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class SamsungElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}
