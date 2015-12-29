package ISP.violate;

import java.util.Date;

public class BSEBroker implements Broker{

    double er=0.0,lo=0.0;
    @Override
    public void buy(String symbol, double vol) {
        //code to buy stocks
    }

    @Override
    public void sell(String symbol, double vol) {
        //code to sell stocks
    }

    @Override
    public double dailyLoss(Date date) {
        //compute daily loss
        return lo;
    }

    @Override
    public double dailyEarnings(Date date) {
        //compute daily earnings
        return er;
    }
    
    public void currentBalance(){
        //computes current balance
    }
}
