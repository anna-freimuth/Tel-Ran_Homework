import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AccountFilterTest {
    AccountFilter accountFilter = new AccountFilter();
    AccountPredicates accountPredicates = new AccountPredicates();

    Account account1 = new Account("123", 100001, true);
    Account account2 = new Account("123456", 0, false);
    Account account3 = new Account("123457", 200000, false);
    Account account4 = new Account("123458", 100030, false);
    Account account5 = new Account("123459", 1, true);

    List<Account> accountList = new ArrayList<>(Arrays.asList(account1, account2, account3, account4, account5));

    @Test
    public void setAccountFilter_specialCase() {
        Account[] expected = new Account[]{account3, account4};
        assertArrayEquals(expected, accountFilter.filter(accountList, accountPredicates.specialCase()).toArray());
    }

    @Test
    public void setAccountFilter_balanceNotEmpty() {
        Account[] expected = new Account[]{account1, account3, account4, account5};
        assertArrayEquals(expected, accountFilter.filter(accountList, accountPredicates.balanceNotEmpty()).toArray());
    }

}
