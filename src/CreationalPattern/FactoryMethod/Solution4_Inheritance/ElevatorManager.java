package CreationalPattern.FactoryMethod.Solution4_Inheritance;

import BehavioralPattern.TemplateMethod.Context.Direction;
import CreationalPattern.FactoryMethod.Context.ElevatorController;

import java.util.ArrayList;
import java.util.List;

/* 템플릿 메서드를 정의하는 클래스: 하위 클래스에서 구현될 기능을 primitive 메서드로 정의 */
public abstract class ElevatorManager {

    private List<ElevatorController> controllers;

    // 주어진 수만큼의 ElevatorController를 생성함
    public ElevatorManager(int controllerCount){
        // 엘리베이터의 이동을 책임지는 ElevatorController 객체 생성
        controllers = new ArrayList<ElevatorController>(controllerCount);
        for(int i=0; i<controllerCount; i++){
            ElevatorController controller = new ElevatorController(i + 1);
            controllers.add(controller);
        }
    }

    // 팩토리 메서드: 스케줄링 전략 객체를 생성하는 기능 제공
    protected abstract ElevatorScheduler getScheduler();

    // 템플릿 메서드: 요청에 따라 엘리베이터를 선택하고 이동시킴
    void requestElevator(int destination, Direction direction){
        // 하위 클래스에서 오버라이드된 getScheduler() 메서드를 호출함 (변경)
        ElevatorScheduler scheduler = getScheduler();  // primitive 또는 hook 메서드
        System.out.println(scheduler);

        // 주어진 전략에 따라 엘리베이터를 선택함
        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        // 선택된 엘리베이터를 이동시킴
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
