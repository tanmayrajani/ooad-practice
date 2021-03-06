package ISP.follow;

import java.util.Date;

public class DailyReporter {
    private BrokerStatistics broker;
    public DailyReporter(){}
    public DailyReporter(BrokerStatistics broker){
        this.broker = broker;
    }
    
    public void currentBalance(){
        Date d = new Date();
        System.out.println("Current balance for today: "+ d.toString());
        System.out.println("Earnings: "+ broker.dailyEarnings(d));
        System.out.println("Losses: "+ broker.dailyLoss(d));
    }
}
