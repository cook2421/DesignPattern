package BehavioralPattern.Strategy.Solution;

public abstract class Robot {
    private String name;
    private AttackStrategy attackStrategy;
    private MovingStrategy movingStrategy;

    public Robot(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void attack(){
        attackStrategy.attack();
    }

    public void move(){
        movingStrategy.move();
    }


    // 집약 관계, 전체 객체가 메모리에서 사라진다 해도 부분 객체는 사라지지 않는다.
    // setter 메서드
    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }

    public void setMovingStrategy(MovingStrategy movingStrategy){
        this.movingStrategy = movingStrategy;
    }
}
