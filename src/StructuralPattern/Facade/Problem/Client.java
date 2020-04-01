package StructuralPattern.Facade.Problem;

public class Client {
    public static void main(String[] args) {
        Beverage beverage = new Beverage("콜라");
        RemoteControl remote = new RemoteControl();
        Movie movie = new Movie("어벤져스");

        beverage.prepare();     // 음료 준비
        remote.turnOn();        // TV를 켜다
        movie.searchMovie();    // 영화를 찾다
        movie.chargeMovie();    // 영화를 결제하다
        movie.playMovie();      // 영화를 재생하다다
    }
}