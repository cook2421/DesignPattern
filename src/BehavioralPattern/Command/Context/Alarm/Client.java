package BehavioralPattern.Command.Context.Alarm;

public class Client {
    public static void main(String[] args) {
        Alarm alarm = new Alarm();
        Button alarmButton = new Button(alarm);
        alarmButton.pressed();
    }
}
