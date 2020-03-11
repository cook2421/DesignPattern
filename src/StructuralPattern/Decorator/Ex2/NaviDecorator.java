package StructuralPattern.Decorator.Ex2;

public class NaviDecorator extends CarOptionDecorator {

    public NaviDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 70;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + " +네비게이션 추가";
    }
}
