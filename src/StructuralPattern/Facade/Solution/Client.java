package StructuralPattern.Facade.Solution;

public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade("콜라", "어벤져스");
        facade.viewMovie();
    }
}
