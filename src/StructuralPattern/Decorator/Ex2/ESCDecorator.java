package StructuralPattern.Decorator.Ex2;

public class ESCDecorator extends CarOptionDecorator {

    public ESCDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + " +ESC 추가";
    }
}
