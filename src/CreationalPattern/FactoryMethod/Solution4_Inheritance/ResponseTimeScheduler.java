package CreationalPattern.FactoryMethod.Solution4_Inheritance;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

/* 싱글턴 패턴으로 구현한 ResponseTimeScheduler 클래스 */
public class ResponseTimeScheduler implements ElevatorScheduler {

    private static ElevatorScheduler scheduler;

    // 생성자를 private으로 정의
    private ResponseTimeScheduler() {}

    // 정적 메서드로 객체 생성을 구현 (싱글턴 패턴)
    public static ElevatorScheduler getInstance(){
        if(scheduler == null){
            scheduler = new ResponseTimeScheduler();
        }
        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction){
        return 1;     // 임의로 선택함
    }
}
