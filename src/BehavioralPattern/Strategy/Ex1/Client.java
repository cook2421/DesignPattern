package BehavioralPattern.Strategy.Ex1;

public class Client {

    private static final int INIT_LOCATION[] = {50, 100, 150};

    public static void main(String[] args) {
        Ball[] balls = new Ball[3];
        for(int i=0; i<balls.length; i++){
            balls[i] = new Ball(INIT_LOCATION[i], INIT_LOCATION[i]);
            balls[i].setDirectionStrategy(new HorizonalMoveStrategy());
            balls[i].setDrawStrategy(new RedDrawStrategy());

            balls[i].start();
        }

        new BallFrame(balls);
    }
}
