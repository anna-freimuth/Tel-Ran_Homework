public class HW11_1 {

    public static void main(String[] args) {
        System.out.println(citiWeather("Берлин"));
        System.out.println(citiWeather("Лондон"));
        System.out.println(citiWeather("Лиссабон"));
        System.out.println(citiWeather("Париж"));
        System.out.println(citiWeather("Москва"));
        System.out.println(citiWeather("Минск")); //-> 24
        System.out.println(citiWeather("Саратов"));

    }

    private static int citiWeather(String cityName) {

        int temperatureOnMonday;

        switch (cityName) {
            case "Берлин":
                temperatureOnMonday = 20;
                return temperatureOnMonday + 6;
            case "Лондон":
                temperatureOnMonday = 17;
                return temperatureOnMonday + 6;
            case "Лиссабон":
                temperatureOnMonday = 25;
                return temperatureOnMonday + 6;
            case "Париж":
                temperatureOnMonday = 23;
                return temperatureOnMonday + 6;
            case "Москва":
                temperatureOnMonday = 19;
                return temperatureOnMonday + 6;
            case "Минск":
                temperatureOnMonday = 18;
                return temperatureOnMonday + 6;
            case "Саратов":
                temperatureOnMonday = 15;
                return temperatureOnMonday + 6;
            default:
                System.out.println("City is not in the set");
                break;
        }
        return -1;
    }
}