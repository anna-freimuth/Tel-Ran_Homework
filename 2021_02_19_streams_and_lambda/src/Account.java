import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Account {
    String number;
    long balance;
    boolean isLocked;

    public Account(String number, long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }
}

class AccountFilter{
    List<Account> filter(List<Account> list, Predicate<Account>predicate){
        List<Account> result = new ArrayList<>();
        list.forEach(account -> {if (predicate.test(account)) result.add(account);});
        return result;
    }
}

class AccountPredicates {
    public Predicate<Account> balanceNotEmpty() {
        return account -> account.balance > 0;
    }

    public Predicate<Account> specialCase() {
        return account -> !account.isLocked && account.balance > 100000;
    }
}
