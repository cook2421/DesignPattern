package BehavioralPattern.Strategy.Ex2;

public interface PriceStrategy {
    int getPrice(int publishYear, int culmulativePurchaseAmount, int price, int count);
}
