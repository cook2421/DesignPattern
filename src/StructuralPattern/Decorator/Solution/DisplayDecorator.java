package StructuralPattern.Decorator.Solution;

/* 다양한 추가 기능에 대한 공통 클래 */
public abstract class DisplayDecorator extends Display {

    private Display decoratedDisplay;

    // '집합 관계'를 통해 RoadDisplay객체에 대한 참조
    public DisplayDecorator(Display decoratedDisplay){
        this.decoratedDisplay = decoratedDisplay;
    }

    @Override
    public void draw() {
        decoratedDisplay.draw();
    }
}
