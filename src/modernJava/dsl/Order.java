package modernJava.dsl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Order {

    private String customer;
    private List<Trade> trades = new ArrayList<>();

    public void addTrade(Trade trade){
        trades.add(trade);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<Trade> getTrades() {
        return trades;

    }

    public void setTrades(List<Trade> trades) {
        this.trades = trades;
        
    }

    public double getValue(){
        return trades.stream().mapToDouble(Trade::getValue).sum();
    }
}
