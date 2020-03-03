package CreationalPattern.FactoryMethod.Solution2_Strategy_Factory;

import BehavioralPattern.TemplateMethod.Context.Enums.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
