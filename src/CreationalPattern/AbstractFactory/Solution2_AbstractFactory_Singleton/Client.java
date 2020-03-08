package CreationalPattern.AbstractFactory.Solution2_AbstractFactory_Singleton;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.AbstractFactory.Problem.Door;
import CreationalPattern.AbstractFactory.Problem.Motor;
import CreationalPattern.AbstractFactory.Problem.VendorID;
import CreationalPattern.AbstractFactory.Solution1_AbstractFactory.ElevatorFactory;

public class Client {
    public static void main(String[] args) {

        String vendorName = "Hyundai";
        VendorID vendorID;


        if(vendorName.equalsIgnoreCase("LG")){
            vendorID = VendorID.LG;
        } else if(vendorName.equalsIgnoreCase("Hyundai")){
            vendorID = VendorID.HYUNDAI;
        } else {
            vendorID = VendorID.SAMSUNG;
        }

        ElevatorFactory factory = ElevatorFactoryFactory.getFactory(vendorID);

        Door door = factory.createDoor();
        Motor motor = factory.createMotor();
        motor.setDoor(door);

        door.open();
        motor.move(Direction.UP);
    }
}
