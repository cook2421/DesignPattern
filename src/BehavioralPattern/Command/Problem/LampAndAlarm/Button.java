package BehavioralPattern.Command.Problem.LampAndAlarm;

enum Mode {
    LAMP, ALARM
}

public class Button {
    private Lamp theLamp;
    private Alarm theAlarm;
    private Mode theMode;

    // 생성자에서 버튼을 눌렀을 때 필요한 기능을 인자로 받는다.
    public Button(Lamp theLamp, Alarm theAlarm){
        this.theLamp = theLamp;
        this.theAlarm = theAlarm;
    }

    // 램프 모드 또는 알람 모드를 설정
    public void setMode(Mode mode){
        this.theMode = mode;
    }

    // 설정된 모드에 따라 램프를 켜거나 알람을 울림
    public void pressed(){
        switch(theMode){
            case LAMP: theLamp.turnOn(); break;
            case ALARM: theAlarm.start(); break;
        }
    }
}
