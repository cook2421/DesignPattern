package CreationalPattern.AbstractFactory.Context;

import BehavioralPattern.TemplateMethod.Context.Direction;

public class LGMotor extends Motor {

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {

    }
}