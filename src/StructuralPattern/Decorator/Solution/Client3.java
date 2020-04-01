package StructuralPattern.Decorator.Solution;

public class Client3 {
    public static void main(String[] args) {
        // 기본 도로 표시 + 차선 표시 + 교통량 표시 + 교차로 표시
        Display road_cross_traffic_lane =
            new LaneDecorator(
            new TrafficDecorator(
            new CrossingDecorator(
            new RoadDisplay())));

        road_cross_traffic_lane.draw();
    }
}
