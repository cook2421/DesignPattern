package CreationalPattern.FactoryMethod.Solution1_Strategy;

import BehavioralPattern.TemplateMethod.Context.Direction;
import CreationalPattern.FactoryMethod.Context.ElevatorController;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    /* 주어진 수만큼의 ElevatorController를 생성함 */
    public ElevatorManager(int controllerCount){
        // 엘리베이터의 이동을 책임지는 ElevatorController 객체 생성
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for(int i=0; i<controllerCount; i++){
            ElevatorController controller = new ElevatorController(i + 1);  // 변경
            controllers.add(controller);
        }
    }

    // 요청에 따라 엘리베이터를 선택하고 이동시킴
    void requestElevator(int destination, Direction direction){
        ElevatorScheduler scheduler;    // 인터페이스

        // 0..23
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY  );

        // 오전에는 ResponseTimeScheduler, 오후에는 ThroughputScheduler
        if(hour < 12){
            scheduler = new ResponseTimeScheduler();
        } else {
            scheduler = new ThroughputScheduler();
        }

        // ElevatorScheduler 인터페이스를 이용해 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);

        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
