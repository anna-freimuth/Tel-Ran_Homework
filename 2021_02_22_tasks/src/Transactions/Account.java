package Transactions;

import java.util.List;

public class Account {
    private String id;
    private  long balance;
    List<Transaction> transactions;

    public Account(String id, long balance, List<Transaction> transactions) {
        this.id = id;
        this.balance = balance;
        this.transactions = transactions;
    }


    public long getBalance() {
        return balance;
    }

}
