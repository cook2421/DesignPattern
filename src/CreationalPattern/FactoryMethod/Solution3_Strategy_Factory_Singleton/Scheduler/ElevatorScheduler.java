package CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton.Scheduler;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton.ElevatorManager;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
