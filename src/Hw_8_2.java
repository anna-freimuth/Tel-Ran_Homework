public class Hw_8_2 {
    public static void main(String[] args) {
        int month= 7 ; //Number of the month
        System.out.print("The season is: ");
        findTheSeason(month);
    }

    public static void  findTheSeason(int MonthChoice){
        switch(MonthChoice){
            case 1:
            case 2:
            case 12:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Please try again, month does not exist");
                break;
        }

    }
}
