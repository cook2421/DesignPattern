package StructuralPattern.Decorator.Ex2;

public class CarOptionDecorator extends CarComponent{

    private CarComponent carComponent;


    public CarOptionDecorator(CarComponent carComponent){
        this.carComponent = carComponent;
    }

    @Override
    public int getPrice() {
        return carComponent.getPrice();
    }

    @Override
    public String getCarInfo() {
        return carComponent.getCarInfo();
    }
}
