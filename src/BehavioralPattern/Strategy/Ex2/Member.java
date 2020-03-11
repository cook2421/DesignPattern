package BehavioralPattern.Strategy.Ex2;

public class Member {

    // 회원은 이름과 누적대여금액을 가짐
    private String name;
    private int accPrice;


    public Member(String name){
        this.name = name;
        accPrice = 0;
    }

    public String getName() {
        return name;
    }

    public void addAccPrice(int price){
        accPrice += price;
    }

    public int getAccPrice() {
        return accPrice;
    }
}
