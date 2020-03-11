package StructuralPattern.Decorator.Ex2;

public class SCCDecorator extends CarOptionDecorator {

    public SCCDecorator(CarComponent carComponent) {
        super(carComponent);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 150;
    }

    @Override
    public String getCarInfo() {
        return super.getCarInfo() + " +크루즈컨트롤 추가";
    }
}
