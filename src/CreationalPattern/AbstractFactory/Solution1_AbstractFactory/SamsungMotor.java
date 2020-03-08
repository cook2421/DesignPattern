package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class SamsungMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("SamsungMotor moves " + direction + "WARD.");
    }
}
