package Transactions;

import java.util.Date;

public class Transaction {
    String uniqueId;
    State state;
    long sum;
    Date date;

    public Transaction(String uniqueId, State state, long sum, Date date) {
        this.uniqueId = uniqueId;
        this.state = state;
        this.sum = sum;
        this.date = date;
    }

}
