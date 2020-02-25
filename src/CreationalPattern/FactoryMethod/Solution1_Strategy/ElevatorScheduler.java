package CreationalPattern.FactoryMethod.Solution1_Strategy;

import BehavioralPattern.TemplateMethod.Context.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
