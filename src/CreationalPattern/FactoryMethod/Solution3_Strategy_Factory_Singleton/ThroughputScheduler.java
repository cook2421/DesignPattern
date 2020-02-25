package CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton;

import BehavioralPattern.TemplateMethod.Context.Direction;

/* 싱글턴 패턴으로 구현한 ThroughputScheduler 클래스 */
public class ThroughputScheduler implements ElevatorScheduler{

    private static ElevatorScheduler scheduler;

    // 생성자를 private으로 정의
    private ThroughputScheduler(){}

    // 정적 메서드로 객체 생성을 구현 (싱글턴 패턴)
    public static ElevatorScheduler getInstance() {
        if(scheduler == null){
            scheduler = new ThroughputScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction){
        return 0;   // 임의로 선택함
    }
}
