package BehavioralPattern.State.Solution;

public interface State {
    public void on_button_pushed(Light light);
    public void off_button_pushed(Light light);
}
