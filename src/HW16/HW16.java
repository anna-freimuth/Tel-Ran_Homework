package HW16;

public class HW16 {
    public static void main(String[] args) {
        enigmaCaesar("Съешь же ещё этих мягких французских булок, да выпей чаю.");
        // result: Фэзыя йз зьи ахлш пвёнлш чугрщцкфнлш дцосн, жг еютзм ъгб.
    }

    private static void enigmaCaesar(String str) {
        String result = "";
        while (str.length() > 0) {
            result += hiddenCharacter(str.charAt(0));
            str = str.substring(1);
        }
        System.out.println(result);
    }

    private static char hiddenCharacter(char openCharacter) {
        if (!Character.isAlphabetic(openCharacter)) {
            return openCharacter;
        }
        String alphabet = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        boolean isLowerCase = Character.isLowerCase(openCharacter);
        int index = alphabet.indexOf(Character.toUpperCase(openCharacter));
        char hidden = alphabet.charAt((index + 3) % alphabet.length());
        return isLowerCase ? Character.toLowerCase(hidden) : hidden;
    }
}
