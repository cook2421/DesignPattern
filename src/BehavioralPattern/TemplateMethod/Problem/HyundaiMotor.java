package BehavioralPattern.TemplateMethod.Problem;

import BehavioralPattern.TemplateMethod.Problem.Enums.Direction;
import BehavioralPattern.TemplateMethod.Problem.Enums.DoorStatus;
import BehavioralPattern.TemplateMethod.Problem.Enums.MotorStatus;

public class HyundaiMotor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door){
        this.door = door;
        motorStatus = MotorStatus.STOPPED; //초기: 멈춘 상태
    }

    private void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }
    public MotorStatus getMotorStatus(){
        return motorStatus;
    }

    /* 엘리베이터 제어 */
    public void move(Direction direction){
        // 이미 이동 중이면 아무 작업을 하지 않음
        if(motorStatus == MotorStatus.MOVING) return;

        DoorStatus doorStatus = door.getDoorStatus();

        // step.1 만약 문이 열려 있으면 우선 문을 닫음
        if(doorStatus == DoorStatus.OPENED){
            door.close();
        }

        // step.2 Hyundai 모터를 주어진 방향으로 이동시킴
        moveHyundaiMotor(direction);

        // step.3 모터 상태를 이동 중으로 변경함
        setMotorStatus(MotorStatus.MOVING);
    }

    private void moveHyundaiMotor(Direction direction){
        // Hyundai Motor를 구동시킴
        System.out.println("MOVING " + direction + "WARD");
    }
}
