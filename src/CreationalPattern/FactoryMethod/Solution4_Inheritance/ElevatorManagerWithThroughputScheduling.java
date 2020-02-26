package CreationalPattern.FactoryMethod.Solution4_Inheritance;

/* 처리량 최대화 전략 하위 클래스 */
public class ElevatorManagerWithThroughputScheduling extends ElevatorManager {

    public ElevatorManagerWithThroughputScheduling(int controllerCount){
        super(controllerCount);  // 상위 클래스 생성자 호출
    }

    // primitive 또는 hook 메서드
    @Override
    protected ElevatorScheduler getScheduler() {
        ElevatorScheduler scheduler = ThroughputScheduler.getInstance();
        return scheduler;
    }
}
