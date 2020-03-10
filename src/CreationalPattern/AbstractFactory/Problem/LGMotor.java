package CreationalPattern.AbstractFactory.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public class LGMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LGMotor moves "+direction+"WARD.");
    }
}