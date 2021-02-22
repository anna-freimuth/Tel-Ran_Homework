package Transactions;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
public class AccountServiceTest {

    Transaction transactionCancelled1 = new Transaction("1", State.CANCELED, 300L, new Date(2020-2-1));
    Transaction transactionCancelled2 = new Transaction("2", State.CANCELED, 700L, new Date(2020-2-2));
    Transaction transactionProcessing1 = new Transaction("3", State.PROCESSING, 1400L, new Date(2020-2-3));
    Transaction transactionFinished1 = new Transaction("4", State.FINISHED, 2800L, new Date(2020-2-4));

    List<Transaction> transactionList1 = Arrays.asList(transactionCancelled1, transactionProcessing1, transactionFinished1);
    List<Transaction> transactionList2 = Arrays.asList(transactionCancelled1, transactionCancelled2, transactionProcessing1);

    Account account1 = new Account("1", 2L, transactionList1);
    Account account2 = new Account("2", 0L, transactionList2);
    Account account3 = new Account("3", 4L, transactionList1);

    List<Account> accountList = Arrays.asList(account1, account2, account3);

    @Test
    public void AccountService_SummingCancelledTransactions() {

        AccountService accountService = new AccountService();
        long result = accountService.sumCancelledTransactionsOfLiquidAccounts(accountList);

        assertEquals(600, result);
    }
}
