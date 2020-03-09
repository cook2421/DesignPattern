package CreationalPattern.AbstractFactory.Solution2_AbstractFactory_Singleton;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.HyundaiDoor;
import CreationalPattern.AbstractFactory.Problem.HyundaiMotor;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class HyundaiElevatorFactory extends ElevatorFactory {

    private static ElevatorFactory factory;


    public static ElevatorFactory getInstance(){
        if(factory == null){
            factory = new HyundaiElevatorFactory();
        }
        return factory;
    }

    @Override
    public Motor createMotor() {
        return new HyundaiMotor();
    }

    @Override
    public Door createDoor() {
        return new HyundaiDoor();
    }
}
