package BehavioralPattern.State.Solution;

import BehavioralPattern.State.SleepingState.Light;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.off_button_pushed();  // 반응 없음
        light.on_button_pushed();
        light.off_button_pushed();
    }
}
