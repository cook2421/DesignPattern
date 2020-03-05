package CreationalPattern.FactoryMethod.Solution1_Strategy.Scheduler;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.FactoryMethod.Solution1_Strategy.ElevatorManager;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
