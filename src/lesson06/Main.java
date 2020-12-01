package lesson06;

public class Main {
    public static void main(String[] args) {
        LoanConsumer client1 = new LoanConsumer("Vasilii", 18, 21000);
        LoanConsumer client2 = new LoanConsumer("Mira", 17, 22000);
        LoanConsumer client3 = new LoanConsumer("Rita", 20, 190000);
        LoanConsumer client4 = new LoanConsumer("Mark", 51, 25000);
        LoanConsumer client5 = new LoanConsumer("Andy", 70, 21000);
        LoanConsumer client6 = new LoanConsumer("Tom", 71, 20000);
        LoanConsumer client7 = new LoanConsumer("Ron", 50, 21000);


        LoanConsumer[] loanConsumers = new LoanConsumer[]{client1,client2,client3,client4,client5,client6,client7};


        LoanIssuer issuer1 = new LoanIssuer("Daniel", true, false);
        LoanIssuer issuer2 = new LoanIssuer("Tina", false, false);
        LoanIssuer issuer3 = new LoanIssuer("Rina", false, true);


        LoanIssuer[] loanIssuers = new LoanIssuer[]{issuer1,issuer2,issuer3};


        for (LoanConsumer consumer: loanConsumers) {
            for (LoanIssuer issuer: loanIssuers) {

                if(issuer.toIssue(consumer)){
                    System.out.println("Employee " + issuer.getName() +  " issues a loan to " + consumer.getName());
                } else{
                    System.out.println("Employee " + issuer.getName() + " does not issue a loan " + consumer.getName());
                }
            }
        }
    }
}
