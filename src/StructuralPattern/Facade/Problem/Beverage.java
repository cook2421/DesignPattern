package StructuralPattern.Facade.Problem;

public class Beverage {

    private String name;

    public Beverage(String name){
        this.name = name;
    }

    public void prepare() {
        System.out.println("음료 준비");
    }
}
