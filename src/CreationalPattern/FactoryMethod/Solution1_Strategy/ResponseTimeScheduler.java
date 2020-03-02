package CreationalPattern.FactoryMethod.Solution1_Strategy;

import BehavioralPattern.TemplateMethod.Context.Enums.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler{

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction){
        return 1;   // 임의로 선택함
    }
}
