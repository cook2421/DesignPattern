package BehavioralPattern.TemplateMethod.Solution.Inheritance;

import BehavioralPattern.TemplateMethod.Context.Direction;
import BehavioralPattern.TemplateMethod.Context.Door;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        LGMotor lgMotor = new LGMotor(door);
        hyundaiMotor.move(Direction.UP); // 위로 올라가도록 엘리베이터 제어
        lgMotor.move(Direction.DOWN); // 위로 올라가도록 엘리베이터 제어
    }
}
