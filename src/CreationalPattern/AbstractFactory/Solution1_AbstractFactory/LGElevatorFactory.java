package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.LGDoor;
import CreationalPattern.AbstractFactory.Problem.LGMotor;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class LGElevatorFactory extends ElevatorFactory {
    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
