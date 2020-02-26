package CreationalPattern.FactoryMethod.Solution3_Strategy_Factory_Singleton;

import BehavioralPattern.TemplateMethod.Context.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
