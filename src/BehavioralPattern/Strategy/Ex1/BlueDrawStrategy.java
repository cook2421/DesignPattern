package BehavioralPattern.Strategy.Ex1;

import java.awt.*;

public class BlueDrawStrategy extends DrawStrategy {
    @Override
    public void draw(Ball ball) {
        ball.setColor(Color.blue);
    }
}
