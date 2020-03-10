package CreationalPattern.AbstractFactory.Problem;

public class MotorFactory {

    // vendorID에 따라 LGMotor 또는 HyundaiMotor 객체를 생성함
    public static Motor createMotor(VendorID vendorID){

        Motor motor = null;
        Door door = null;

        switch (vendorID){
            case LG:
                motor = new LGMotor(door);
                break;
            case HYUNDAI:
                motor = new HyundaiMotor(door);
                break;
        }

        return motor;
    }
}