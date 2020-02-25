package CreationalPattern.FactoryMethod.Solution2_Strategy_Factory;

import java.util.Calendar;

public class SchedulerFactory {

    // 스케줄링 전략에 맞는 객체를 생성
    public static ElevatorScheduler getScheduler(SchedulingStrategyID strategyID){
        ElevatorScheduler scheduler = null;  // 각 전략에 의해 할당됨

        switch(strategyID){
            case RESPONSE_TIME: // 대기 시간 최소화 전략
                scheduler = new ResponseTimeScheduler();
                break;

            case THROUGHPUT:    // 처리량 최대화 전략
                scheduler = new ThroughputScheduler();
                break;

            case DYNAMIC:       // 동적 스케줄링
                // 0..23
                int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
                // 오전: 대기 시간 최소화, 오후: 처리량 최대화
                if(hour < 12){
                    scheduler = new ResponseTimeScheduler();
                } else {
                    scheduler = new ThroughputScheduler();
                }
                break;
        }
        return scheduler;
    }
}
