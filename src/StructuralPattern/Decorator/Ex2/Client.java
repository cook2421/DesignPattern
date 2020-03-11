package StructuralPattern.Decorator.Ex2;

public class Client {
    public static void main(String[] args) {

        BasicCar basic = new BasicCar(2000, "깡통");
        System.out.println("[[기본 차량]] 가격: "+basic.getPrice()+"만원.");
        System.out.println("[[기본 차량]] 옵션: "+basic.getCarInfo());

        System.out.println();

        AirBagDecorator airbag = new AirBagDecorator(basic);
        System.out.println("[[에어백 차량]] 가격: "+airbag.getPrice()+"만원.");
        System.out.println("[[에어백 차량]] 옵션: "+airbag.getCarInfo());

        System.out.println();

        ESCDecorator esc = new ESCDecorator(airbag);
        System.out.println("[[ESC 에어백 차량]] 가격: "+esc.getPrice()+"만원.");
        System.out.println("[[ESC 에어백 차량]] 옵션: "+esc.getCarInfo());

        System.out.println();

        NaviDecorator navi = new NaviDecorator(esc);
        System.out.println("[[ESC 에어백 네비 차량]] 가격: "+navi.getPrice()+"만원.");
        System.out.println("[[ESC 에어백 네비 차량]] 옵션: "+navi.getCarInfo());

        System.out.println();

        SCCDecorator scc = new SCCDecorator(navi);
        System.out.println("[[풀옵션 차량]] 가격: "+scc.getPrice()+"만원.");
        System.out.println("[[풀옵션 차량]] 옵션: "+scc.getCarInfo());
    }
}
