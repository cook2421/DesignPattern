package CreationalPattern.AbstractFactory.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {

    }
}
