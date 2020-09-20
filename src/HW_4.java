public class HW_4 {
    public static void main(String[] args) {
        char copyright = '\u00A9';
        char registered ='\u00AE';
        System.out.println(copyright);
        System.out.println(registered);
        Unicode();
        whatIsASCII();
        whatIsUTF();
        isName();

    }

    private static void isName() {
        String name = "Kotik";
        String surname = "Cat";
        String street = "No street";

        System.out.println("User name: " + name + "\n"
        + "User surname: " + surname +"\n"
        + "Street: " + street);

    }

    private static void whatIsUTF() {
        String isUTF = "UTF-8 (от англ. Unicode Transformation Format, 8-bit — «формат преобразования Юникода, 8-бит») " +
                "— распространённый стандарт кодирования символов, позволяющий более компактно" +
                " хранить и передавать символы Юникода, используя переменное количество байт (от 1 до 4), и обеспечивающий " +
                "полную обратную совместимость с 7-битной кодировкой ASCII. Стандарт UTF-8 официально закреплён в документах" +
                " RFC 3629 и ISO/IEC 10646 Annex D.\n" +
                "\n" +
                "Кодировка UTF-8 сейчас является доминирующей в веб-пространстве. Она также нашла широкое применение в" +
                " UNIX-подобных операционных системах";
        System.out.println(isUTF);
    }

    private static void whatIsASCII() {
        String isASCII = "ASCII (англ. American standard code for information interchange," +
                " — название таблицы (кодировки, набора), в которой некоторым распространённым" +
                " печатным и непечатным символам сопоставлены числовые коды.";
        System.out.println(isASCII);
    }

    private static void Unicode() {
        String unicode ="Юнико́д или Унико́д — стандарт кодирования символов, " +
                "включающий в себя знаки почти всех письменных языков мира. " +
                "В настоящее время стандарт является преобладающим в Интернете.";
        System.out.println(unicode);
    }
}

