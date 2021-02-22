package Transactions;

import java.util.List;

public class AccountService {
    long sumCancelledTransactionsOfLiquidAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance() > 0)
                .flatMapToLong(account -> account.transactions.stream()
                        .filter(transaction -> transaction.state == State.CANCELED)
                        .mapToLong(transaction -> transaction.sum)
                )
                .sum();

    }
}
