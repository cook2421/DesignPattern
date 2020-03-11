package StructuralPattern.Decorator.Ex2;

public class AirBagDecorator extends CarOptionDecorator {

    public AirBagDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + " +에어백 추가";
    }
}
