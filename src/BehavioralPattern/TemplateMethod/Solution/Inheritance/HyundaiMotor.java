package BehavioralPattern.TemplateMethod.Solution.Inheritance;

import BehavioralPattern.TemplateMethod.Context.Direction;
import BehavioralPattern.TemplateMethod.Context.Door;

/* Motor를 상속받아 HyundaiMotor클래스를 구현 */
public class HyundaiMotor extends Motor {

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction){
        // Hyundai Motor를 구동시킴
        System.out.println("(Hyundai)MOVING " + direction + "WARD");
    }
}
