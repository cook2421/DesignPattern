package CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.FactoryMethod.Problem.ElevatorController;
import CreationalPattern.FactoryMethod.Solution2_Strategy_Factory.SchedulingStrategyID;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;


    // 주어진 수만큼의 ElevatorController를 생성함
    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID){
        // 엘리베이터의 이동을 책임지는 ElevatorController 객체 생성
        controllers = new ArrayList<>(controllerCount);

        for(int i=0; i<controllerCount; i++){
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }

        setStrategyID(strategyID);
    }


    // 실행 중에 다른 스케줄링 전략으로 지정 가능
    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }


    // 요청에 따라 엘리베이터를 선택하고 이동시킴
    void requestElevator(int destination, Direction direction){
        // 주어진 전략 ID에 해당되는 ElevatorScheduler를 사용함(변경)
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        // 주어진 전략에 따라 엘리베이터를 선택함
        int selectdElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectdElevator).gotoFloor(destination);
    }
}
