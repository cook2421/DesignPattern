package BehavioralPattern.Command.Context.Lamp;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Button lampButton = new Button(lamp);
        lampButton.pressed();
    }
}
