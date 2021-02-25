import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.averagingLong;
import static java.util.stream.Collectors.groupingBy;


public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(239, -5, 366);

        double average = numbers.stream()
                .collect(Collectors.averagingInt((num) -> num));

        double max = numbers.stream()
                .collect(Collectors.maxBy(Integer::compare)).orElse(Integer.MIN_VALUE);

        List<Account> accounts = Arrays.asList(new Account("1", 1000, AccountState.ACTIVE),
                new Account("2", 10000, AccountState.ACTIVE),
                new Account("3", 5000, AccountState.BLOCKED));

        Map<AccountState, List<Account>> accountByState = accounts.stream()
                                .collect(groupingBy(account -> account.state));

        Map<AccountState, Double> averageBalanceByState = accounts.stream()
                .collect(groupingBy(account -> account.state, averagingLong(account -> account.balance)));

        System.out.println();
    }
}

class Account {
    String uuid;
    long balance;
    AccountState state;

    public Account(String uuid, long balance, AccountState state) {
        this.uuid = uuid;
        this.balance = balance;
        this.state = state;
    }
}

enum AccountState {
    REMOVED, ACTIVE, BLOCKED
}
