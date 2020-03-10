package BehavioralPattern.Strategy.Ex2;

public class VipMemberPriceStrategy implements PriceStrategy{
    @Override
    public int getPrice(int publishYear, int culmulativePurchaseAmount, int price, int count) {

        int calculatedPrice = 0;

        for(int i=0; i<count; i++) {
            if(culmulativePurchaseAmount >= 100000){
                calculatedPrice += price - (int)(price * 0.1);
            } else {
                calculatedPrice += price;
            }
        }

        return calculatedPrice;
    }
}
