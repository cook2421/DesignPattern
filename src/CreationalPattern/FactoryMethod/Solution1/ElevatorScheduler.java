package CreationalPattern.FactoryMethod.Solution1;

import BehavioralPattern.TemplateMethod.Context.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
