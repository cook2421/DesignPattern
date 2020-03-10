package CreationalPattern.AbstractFactory.Solution1_AbstractFactory;

import CreationalPattern.AbstractFactory.Problem.Door;

public class SamsungDoor extends Door {

    @Override
    protected void doClose() {
        System.out.println("close Samsung Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open Samsung Door");
    }
}
