package CreationalPattern.AbstractFactory.Solution2_AbstractFactory_Singleton;

import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.LGDoor;
import CreationalPattern.AbstractFactory.Problem.LGMotor;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class LGElevatorFactory extends ElevatorFactory {

    private static ElevatorFactory factory;


    public static  ElevatorFactory getInstance(){
        if(factory == null){
            factory = new LGElevatorFactory();
        }
        return factory;
    }

    @Override
    public Motor createMotor() {
        return new LGMotor();
    }

    @Override
    public Door createDoor() {
        return new LGDoor();
    }
}
