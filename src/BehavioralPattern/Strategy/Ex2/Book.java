package BehavioralPattern.Strategy.Ex2;

public class Book {

    private String sign;
    private int publishYear;
    private int price;
    private PriceStrategy priceStrategy;

    public Book(String sign, int publishYear, int price){
        this.sign = sign;
        this.publishYear = publishYear;
        this.price = price;
    }

    public String getSign() {
        return sign;
    }

    public void setPriceStrategy(PriceStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public int getPrice(int culmulativePurchaseAmount, int count){
        return priceStrategy.getPrice(publishYear, culmulativePurchaseAmount, price, count);
    }
}
