package BehavioralPattern.Strategy.Ex2;

public class Book {

    // 책은 서명, 출판년도, 가격을 가짐
    private String name;
    private int publishYear;
    private int price;


    public Book(String name, int publishYear, int price){
        this.name = name;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public int getPrice() {
        return price;
    }
}
