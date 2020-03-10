package CreationalPattern.AbstractFactory.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public class HyundaiMotor extends Motor {

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("HyundaiMotor moves "+direction+"WARD.");
    }
}
