package CreationalPattern.FactoryMethod.Solution1;

import BehavioralPattern.TemplateMethod.Context.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler{

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction){
        return 1;   // 임의로 선택함
    }
}
