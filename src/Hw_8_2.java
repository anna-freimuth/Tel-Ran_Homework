public class Hw_8_2 {
    public static void main(String[] args) {
        int month= 7 ; //Number of the month
        System.out.print("The season is: ");
        findTheSeason(month);
    }

    public static void  findTheSeason(int MonthChoice){
        switch(MonthChoice){
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
                System.out.println("Winter");
                break;
            default:
                System.out.println("Please try again, month does not exist");
                break;
        }

    }
}
