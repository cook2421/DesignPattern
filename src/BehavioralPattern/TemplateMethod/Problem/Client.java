package BehavioralPattern.TemplateMethod.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;

public class Client {
    public static void main(String[] args) {
        Door door = new Door();
        HyundaiMotor hyundaiMotor = new HyundaiMotor(door);
        hyundaiMotor.move(Direction.UP); // 위로 올라가도록 엘리베이터 제어
    }
}
