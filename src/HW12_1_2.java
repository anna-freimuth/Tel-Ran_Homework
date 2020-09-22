
public class HW12_1_2 {
    public static void main(String[] args) {
        System.out.println(citiWeather("Минск", "Пятница"));//->22
        System.out.println(citiWeather("Лиссабон", "Четверг"));// -> 28
        System.out.println(citiWeather("Париж", "Суббота"));// ->28
    }

    private static int citiWeather(String cityName, String dayOfWeek) {
        int temperatureOnMonday = 0;
        int offset = 0;
        switch (cityName) {
            case "Берлин":
                temperatureOnMonday = 20;
                break;
            case "Лондон":
                temperatureOnMonday = 17;
                break;
            case "Лиссабон":
                temperatureOnMonday = 25;
                break;
            case "Париж":
                temperatureOnMonday = 23;
                break;
            case "Москва":
                temperatureOnMonday = 19;
                break;
            case "Минск":
                temperatureOnMonday = 18;
                break;
            case "Саратов":
                temperatureOnMonday = 15;
        }
        switch (dayOfWeek) {
            case "Понедельник":
                offset = 0;
                break;
            case "Вторник":
                offset = 1;
                break;
            case "Среда":
                offset = 2;
                break;
            case "Четверг":
                offset = 3;
                break;
            case "Пятница":
                offset = 4;
                break;
            case "Суббота":
                offset = 5;
                break;
            case "Воскресенье":
                offset = 6;
                break;
        }

        return temperatureOnMonday + offset;
    }
}
