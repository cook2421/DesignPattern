package BehavioralPattern.Strategy.Problem;

public abstract class Robot {

    private String name;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    // 추상 메서드
    public abstract void attack();
    public abstract void move();
}
