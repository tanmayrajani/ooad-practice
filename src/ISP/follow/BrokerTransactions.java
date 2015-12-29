package ISP.follow;

public interface BrokerTransactions {
    public void buy(String symbol,double vol);
    public void sell(String symbol,double vol);
}
