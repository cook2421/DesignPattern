package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.Motor;

public class Client {
    public static void main(String[] args) {

        ElevatorFactory factory = null;
        String vendorName = "samsung";

        if(vendorName.equalsIgnoreCase("LG")){      // 인자에 따라 LG 또는 Hyundai 또는 Samsung 팩토리를 생성함
            factory = new LGElevatorFactory();
        } else if(vendorName.equalsIgnoreCase("Hyundai")){
            factory = new HyundaiElevatorFactory();
        } else {
            factory = new SamsungElevatorFactory();
        }

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
