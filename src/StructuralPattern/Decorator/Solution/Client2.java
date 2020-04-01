package StructuralPattern.Decorator.Solution;

public class Client2 {
    public static void main(String[] args) {
        // 기본 도로 표시 + 차선 표시 + 교통량 표시
        Display road_lane_traffic =
                new TrafficDecorator(
                new LaneDecorator(
                new RoadDisplay()));

        road_lane_traffic.draw();
    }
}