package BehavioralPattern.Strategy.Ex2;

public class Client {
    public static void main(String[] args) {

        Member yi = new YiJaeEun("이재은");
        Member cook = new CookSeungHyun("국승현");

        Book jungsuk = new JavaJungSuk("자바의 정석", 2012, 30000);
        Book refactoring = new Refactoring("리팩토링", 2003, 50000);

        jungsuk.setPriceStrategy(new VipMemberPriceStrategy());
        refactoring.setPriceStrategy(new Over10YearsPriceStrategy());

        yi.buyBook(jungsuk, 4);
        System.out.println();
        yi.buyBook(jungsuk, 4);
        System.out.println();
        cook.buyBook(refactoring, 4);
        System.out.println();
        cook.buyBook(jungsuk, 4);
    }
}
