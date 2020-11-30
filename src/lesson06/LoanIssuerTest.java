package lesson06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoanIssuerTest {
    LoanConsumer client1 = new LoanConsumer("Vasilii", 18, 21000);
    LoanConsumer client2 = new LoanConsumer("Mira", 17, 22000);
    LoanConsumer client3 = new LoanConsumer("Rita", 20, 19000);
    LoanConsumer client4 = new LoanConsumer("Mark", 51, 25000);
    LoanConsumer client5 = new LoanConsumer("Andy", 70, 21000);
    LoanConsumer client6 = new LoanConsumer("Tom", 71, 20000);
    LoanConsumer client7 = new LoanConsumer("Ron", 50, 21000);

    LoanIssuer issuer1 = new LoanIssuer("Daniel", true, false);
    LoanIssuer issuer2 = new LoanIssuer("Tina", false, false);
    LoanIssuer issuer3 = new LoanIssuer("Rina", false, true);
    LoanIssuer[] loanIssuers = new LoanIssuer[]{issuer1, issuer2, issuer3};

    @Test
    public void loanIssue_clientIs17_getsDeclines() {
        for (LoanIssuer issuer : loanIssuers) {
            assertFalse(issuer.toIssue(client2));
        }
    }

    @Test
    public void loanIssue_clientIs20WithoutEnoughIncome_getsDeclined() {
        for (LoanIssuer issuer : loanIssuers) {
            assertFalse(issuer.toIssue(client3));
        }
    }

    @Test
    public void loanIssue_clientIs18WithIncome_getsLoan() {
        for (LoanIssuer issuer : loanIssuers) {
            assertTrue(issuer.toIssue(client1));
        }

    }

    @Test
    public void loanIssue_clientIs51WithEnoughIncome_varyingResults() {
        assertTrue(issuer1.toIssue(client4));
        assertTrue(issuer3.toIssue(client4));

        assertFalse(issuer2.toIssue(client4));
    }


    @Test
    public void loanIssue_clientIs70WithEnoughIncome_varyingResults() {
        assertTrue(issuer1.toIssue(client5));
        assertTrue(issuer3.toIssue(client5));

        assertFalse(issuer2.toIssue(client5));
    }

    @Test
    public void loanIssue_clientIs71WithEnoughIncome_varyingResults() {
        assertTrue(issuer1.toIssue(client6));

        assertFalse(issuer2.toIssue(client6));
        assertFalse(issuer3.toIssue(client6));
    }

    @Test
    public void loanIssue_clientIs50WithEnoughIncome_varyingResults() {
        for (LoanIssuer issuer : loanIssuers) {
            assertFalse(issuer.toIssue(client7));
        }
    }
}
