
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Transaction {
    Long sum;
    String account;

    public Transaction(Long sum, String account) {
        this.sum = sum;
        this.account = account;
    }

    public Map<String, Long> sumTransactions(List<Transaction> transactions) {
        return transactions.stream()
                .collect(Collectors.groupingBy(transaction -> transaction.account,
                        Collectors.summingLong(transaction -> transaction.sum)));
    }
}
