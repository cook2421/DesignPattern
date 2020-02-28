package CreationalPattern.AbstractFactory.Context;

import BehavioralPattern.TemplateMethod.Context.Direction;

public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {

    }
}
