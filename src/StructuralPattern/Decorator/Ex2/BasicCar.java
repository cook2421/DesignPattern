package StructuralPattern.Decorator.Ex2;

public class BasicCar extends CarComponent{

    private int price;
    private String carInfo;


    public BasicCar(int price, String carInfo){
        this.price = price;
        this.carInfo = carInfo;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getCarInfo() {
        return carInfo;
    }
}
