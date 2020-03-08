package CreationalPattern.AbstractFactory.Solution2_AbstractFactory_Singleton;

import CreationalPattern.AbstractFactory.Problem.VendorID;
import CreationalPattern.AbstractFactory.Solution1_AbstractFactory.ElevatorFactory;

public class ElevatorFactoryFactory {    // 팩토리 클래스에 팩토리 메서드 패턴을 적용함
    public static ElevatorFactory getFactory(VendorID vendorID){
        ElevatorFactory factory = null;
        switch (vendorID){
            case LG:
                factory = LGElevatorFactory.getInstance();      // LG 팩토리의 생성
                break;

            case HYUNDAI:
                factory = HyundaiElevatorFactory.getInstance(); // Hyundai 팩토리의 생성
                break;

            case SAMSUNG:
                factory = SamsungElevatorFactory.getInstance(); // Samsung 팩토리의 생성
                break;
        }

        return factory;
    }
}
