package BehavioralPattern.Command.Solution;

public class AlarmStartCommand implements Command{
    private Alarm theAlarm;

    public AlarmStartCommand(Alarm theAlarm){
        this.theAlarm = theAlarm;
    }

    // BehavioralPattern.Command 인터페이스의 execute 메서드
    public void execute(){
        theAlarm.start();
    }
}
