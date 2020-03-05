package CreationalPattern.FactoryMethod.Solution1_Strategy;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public class ThroughputScheduler implements ElevatorScheduler{

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;  // 임의로 선택함
    }
}
