package BehavioralPattern.Strategy.Ex2;

public class Member {

    private String name;
    private int culmulativePurchaseAmount;

    public Member(String name){
        this.name = name;
        culmulativePurchaseAmount = 0;
    }

    public int getCulmulativePurchaseAmount() {
        return culmulativePurchaseAmount;
    }

    public void buyBook(Book book, int count){
        String sign = book.getSign();
        System.out.println(name+"(이)가 "+sign+" 책을 "+count+"권 구매합니다.");

        int price = book.getPrice(culmulativePurchaseAmount, count);
        culmulativePurchaseAmount += price;

        System.out.println("구매금액 : "+ price+"원.");
        System.out.println("총 누적금액 : "+culmulativePurchaseAmount+"원.");
    }
}
