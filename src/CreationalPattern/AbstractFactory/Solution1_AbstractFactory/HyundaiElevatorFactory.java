package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.HyundaiDoor;
import CreationalPattern.AbstractFactory.Problem.HyundaiMotor;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
