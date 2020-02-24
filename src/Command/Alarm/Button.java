package Command.Alarm;

public class Button {

    private Alarm theAlarm;

    public Button(Alarm theAlarm) {
        this.theAlarm = theAlarm;
    }

    public void pressed() {
        theAlarm.start();
    }
}
