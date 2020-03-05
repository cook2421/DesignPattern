package CreationalPattern.FactoryMethod.Solution2_Strategy_Factory.Scheduler;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.FactoryMethod.Solution2_Strategy_Factory.ElevatorManager;

public class ResponseTimeScheduler implements ElevatorScheduler{

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction){
        return 1;   // 임의로 선택함
    }
}
