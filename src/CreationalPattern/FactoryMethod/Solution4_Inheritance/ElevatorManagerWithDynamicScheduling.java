package CreationalPattern.FactoryMethod.Solution4_Inheritance;

import java.util.Calendar;

/* 동적 스케줄링 전략 하위 클래스 */
public class ElevatorManagerWithDynamicScheduling extends ElevatorManager {

    public ElevatorManagerWithDynamicScheduling(int controllerCount){
        super(controllerCount);  // 상위 클래스 생성자 호출
    }

    // primitive 또는 hook 메서드
    @Override
    protected ElevatorScheduler getScheduler(){
        ElevatorScheduler scheduler = null;

        // 0..23
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        // 오전: 대기 시간 최소화, 오후: 처리량 최대화
        if(hour < 12){
            scheduler = ResponseTimeScheduler.getInstance();
        } else {
            scheduler = ThroughputScheduler.getInstance();
        }

        return scheduler;
    }
}
