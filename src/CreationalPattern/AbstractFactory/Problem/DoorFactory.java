package CreationalPattern.AbstractFactory.Problem;

public class DoorFactory {

    // vendorID에 따라 LGDoor 또는 HyundaiDoor 객체를 생성함
    public static Door createDoor(VendorID vendorID){

        Door door = null;

        switch (vendorID){
            case LG:
                door = new LGDoor();
                break;
            case HYUNDAI:
                door = new HyundaiDoor();
                break;
        }

        return door;
    }
}
