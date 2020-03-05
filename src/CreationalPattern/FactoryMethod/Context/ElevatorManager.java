package CreationalPattern.FactoryMethod.Context;

import BehavioralPattern.TemplateMethod.Context.Enums.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {

    private List<ElevatorController> controllers;
    private ThroughputScheduler scheduler;


    /* 주어진 수만큼의 ElevatorController를 생성함 */
    public ElevatorManager(int controllerCount){
        // 엘리베이터의 이동을 책임지는 ElevatorController 객체 생성
        controllers = new ArrayList<>(controllerCount);

        for(int i=0; i<controllerCount; i++){
            ElevatorController controller = new ElevatorController(i);
            controllers.add(controller);
        }

        // 엘리베이터를 스케줄링(엘리베이터 선택)하기 위한 ThroughputScheduler 객체 생성
        scheduler = new ThroughputScheduler();
    }


    /* 요청에 따라 엘리베이터를 선택하고 이동시킴 */
    void requestElevator(int destination, Direction direction){
        // ThroughputScheduler를 이용해 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
