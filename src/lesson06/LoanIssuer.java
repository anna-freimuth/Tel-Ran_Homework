package lesson06;

public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toIssue(LoanConsumer loanConsumer) {
        if (loanConsumer.getAge() < 18 || loanConsumer.getAnnualIncome() < 20000) return false;
        if (isLazy && loanConsumer.getAge() >= 18 && loanConsumer.getAnnualIncome() >= 20000) return true;
        if (!isLazy && isKind && loanConsumer.getAnnualIncome() >= 20000 && loanConsumer.getAge() <= 70) return true;
        if (!isLazy && !isKind && loanConsumer.getAnnualIncome() >= 20000 && loanConsumer.getAge() <= 50) return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public boolean isKind() {
        return isKind;
    }

}
