public class Hw_8_1 {
    public static void main(String[] args) {
        int age = 20;   //age of a costumer
        sellerActions(age);

    }

    public static void sellerActions(int costumerAge) {
        switch(costumerAge){
            case 10:
                System.out.println("Impossible to sell alcohol to a customer");
                break;
            case 17:
                System.out.println("Impossible to sell alcohol to a customer");
                break;
            case 18:
                System.out.println("Action approved, possible to sell alcohol");
                break;
            case 20:
                System.out.println("Action approved, possible to sell alcohol");
                break;
            case 30:
                System.out.println("Action approved, possible to sell alcohol");
                break;
            default:
                System.out.println("Please show your ID");
                break;
        }
    }
}
