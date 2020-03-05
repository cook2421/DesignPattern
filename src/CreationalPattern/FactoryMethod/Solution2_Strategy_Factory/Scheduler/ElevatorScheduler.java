package CreationalPattern.FactoryMethod.Solution2_Strategy_Factory.Scheduler;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.FactoryMethod.Solution2_Strategy_Factory.ElevatorManager;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
