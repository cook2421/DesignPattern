package CreationalPattern.FactoryMethod.Solution4_Inheritance;

/* 대기 시간 최소화 전략 하위 클래스 */
public class ElevatorManagerWithResponseTimeScheduling extends ElevatorManager {

    public ElevatorManagerWithResponseTimeScheduling(int controllerCount){
        super(controllerCount);  // 상위 클래스 생성자 호출
    }

    // primitive 또는 hook 메서드
    @Override
    protected ElevatorScheduler getScheduler(){
        ElevatorScheduler scheduler = ResponseTimeScheduler.getInstance();
        return scheduler;
    }
}
