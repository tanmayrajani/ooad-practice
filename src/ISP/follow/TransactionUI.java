package ISP.follow;

public class TransactionUI {
    private BrokerTransactions broker;
    public TransactionUI(){}
    public TransactionUI(BrokerTransactions broker){
        this.broker = broker;
    }
    public void buyStocks(){
        String sym1 = null;
        double vol1=0.0;
        //UI logic to get data from buy-form
        this.broker.buy(sym1, vol1);
    }
    
    public void sellStocks(){
        String sym1 = null;
        double vol1=0.0;
        //UI logic to get data from buy-form
        this.broker.sell(sym1, vol1);
    }
}
