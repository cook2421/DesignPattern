package CreationalPattern.AbstractFactory.Solution2_AbstractFactory_Singleton;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.Motor;
import CreationalPattern.AbstractFactory.Solution1_AbstractFactory.SamsungDoor;
import CreationalPattern.AbstractFactory.Solution1_AbstractFactory.SamsungMotor;

public class SamsungElevatorFactory extends ElevatorFactory {

    private static ElevatorFactory factory = null;


    public static ElevatorFactory getInstance(){
        if(factory == null){
            factory = new SamsungElevatorFactory();
        }
        return factory;
    }

    @Override
    public Motor createMotor() {
        return new SamsungMotor();
    }

    @Override
    public Door createDoor() {
        return new SamsungDoor();
    }
}
