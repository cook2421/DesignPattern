package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.Motor;

public abstract class ElevatorFactory {     // 추상 부품을 생성하는 추상 팩토리
    public abstract Motor createMotor();
    public abstract Door createDoor();
}
