package BehavioralPattern.TemplateMethod.Solution.Inheritance;

import BehavioralPattern.TemplateMethod.Context.Enums.Direction;
import BehavioralPattern.TemplateMethod.Context.Door;

/* Motor를 상속받아 LGMotor 클래스를 구현 */
public class LGMotor extends Motor {

    public LGMotor(Door door){
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction){
        // LG Motor를 구동시
        System.out.println("(LG)MOVING " + direction + "WARD");
    }
}
