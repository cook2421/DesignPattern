package BehavioralPattern.Command.Solution.Command;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampOnCommand = new LampOnCommand(lamp);

        Alarm alarm = new Alarm();
        Command alarmStartCommand = new AlarmStartCommand(alarm);


        Button lampButton = new Button(lampOnCommand); // 램프 켜는 BehavioralPattern.Command 설정
        lampButton.pressed();  // 램프 켜는 기능 수행

        Button alarmButton = new Button(alarmStartCommand); // 알람 울리는 BehavioralPattern.Command 설정
        alarmButton.pressed();  // 알람 울리는 기능 수행
        alarmButton.setCommand(lampOnCommand);  // 다시 램프 켜는 Command로 설정
        alarmButton.pressed();  // 램프 켜는 기능 수행
    }
}
