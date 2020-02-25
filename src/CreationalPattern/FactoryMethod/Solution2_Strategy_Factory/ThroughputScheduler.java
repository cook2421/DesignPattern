package CreationalPattern.FactoryMethod.Solution2_Strategy_Factory;

import BehavioralPattern.TemplateMethod.Context.Direction;

public class ThroughputScheduler implements ElevatorScheduler{

    @Override
    public int selectElevator(ElevatorManager manager, int destination, Direction direction) {
        return 0;  // 임의로 선택함
    }
}
