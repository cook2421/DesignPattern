package BehavioralPattern.Strategy.Ex2;

import java.util.Calendar;

public class Over10YearsPriceStrategy implements PriceStrategy {

    @Override
    public int getPrice(int publishYear, int culmulativePurchaseAmount, int price, int count) {

        int calculatedPrice = 0;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        for(int i=0; i<count; i++) {
            if(publishYear <= currentYear - 10){
                    calculatedPrice += price - (int)(price * 0.5);
            } else {
                    calculatedPrice += price;
            }
        }

        return calculatedPrice;
    }
}
