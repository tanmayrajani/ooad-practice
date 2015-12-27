package ISP.violate;
import java.util.Date;

public interface Broker {
    public void buy(String symbol,double vol);
    public void sell(String symbol,double vol);
    public double dailyLoss(Date date);
    public double dailyEarnings(Date date);
}

