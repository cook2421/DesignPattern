package CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
