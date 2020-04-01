package StructuralPattern.Facade.Solution;

import StructuralPattern.Facade.Problem.Beverage;
import StructuralPattern.Facade.Problem.Movie;
import StructuralPattern.Facade.Problem.RemoteControl;

public class Facade {

    private String beverageName = "";
    private String movieName = "";


    public Facade(String beverageName, String movieName){
        this.beverageName = beverageName;
        this.movieName = movieName;
    }

    public void viewMovie(){
        Beverage beverage = new Beverage(beverageName);
        RemoteControl remote = new RemoteControl();
        Movie movie = new Movie(movieName);

        beverage.prepare();
        remote.turnOn();
        movie.searchMovie();
        movie.chargeMovie();
        movie.playMovie();
    }
}
