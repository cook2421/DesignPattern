package CreationalPattern.FactoryMethod.Solution4_Inheritance;

import BehavioralPattern.TemplateMethod.Context.Direction;

public interface ElevatorScheduler {
    public int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
