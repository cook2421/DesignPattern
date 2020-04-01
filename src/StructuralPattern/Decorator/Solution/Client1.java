package StructuralPattern.Decorator.Solution;

public class Client1 {
    public static void main(String[] args) {

        Display road = new RoadDisplay();
        road.draw();    // 기본 도로 표시

        Display road_lane = new LaneDecorator(new RoadDisplay());
        road_lane.draw();    // 기본 도로 표시 + 차선 표시

        Display road_traffic = new TrafficDecorator(new RoadDisplay());
        road_traffic.draw(); // 기본 도로 표시 + 교통량 표시
    }
}
