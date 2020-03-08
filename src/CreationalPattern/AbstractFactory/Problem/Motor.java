package CreationalPattern.AbstractFactory.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import BehavioralPattern.TemplateMethod.Problem.Enums.DoorStatus;
import BehavioralPattern.TemplateMethod.Problem.Enums.MotorStatus;

public abstract class Motor {

    private Door door;
    private MotorStatus motorStatus;


    public Motor() {
        motorStatus = MotorStatus.STOPPED;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    protected void setMotorStatus(MotorStatus motorStatus){
        this.motorStatus = motorStatus;
    }
    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void move(Direction direction){
        MotorStatus motorStatus = getMotorStatus();

        // 이미 이동 중이면 아무 작업을 하지 않음
        if(motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();

        // 만약 문이 열려 있으면 우선 문을 닫음
        if(doorStatus == DoorStatus.OPENED){
            door.close();
        }

        // 모터를 주어진 방향으로 이동시킴
        moveMotor(direction); // (HyundaiMotor와 LGMotor에서 오버라이드 됨)

        // 모터 상태를 이동 중으로 변경함
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
