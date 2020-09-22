public class HW12_3 {
    public static void main(String[] args) {
        //contains(CharSequence s)
    //Returns true if and only if this string contains the specified sequence of char values.
        String str1 = "Java and Coffee";
        String str2 ="and";
        System.out.println(str1.contains(str2)); //-> true

        //endsWith(String suffix)
        //Tests if this string ends with the specified suffix (boolean)
        String str3 = "Java work";
        String end_str = "rk";
        System.out.println(str3.endsWith(end_str)); //->true

        //equals(Object anObject)
        //Compares this string to the specified object. The result is true if and only if the argument
        // is not null and is a String object that represents the same sequence of characters as this object.
        String str4 = "Coffee";
        String str5 = "Coffee";
        System.out.println(str4.equals(str5));  //->true

        //startsWith(String prefix)
        //The startsWith() method tests if the substring of this string
        // beginning at the specified index starts with the specified prefix.
        System.out.println("Cat and dog".startsWith("Cat")); //-> true

        //toLowerCase()
        //Converts all of the characters in this String to lower case using the rules of the default locale.
        System.out.println("MOBILE".toLowerCase());

        //toUpperCase()
        //Converts all of the characters in this String to upper case using the rules of the default locale.
        System.out.println("mobile".toUpperCase());

        //trim()
        //Returns a string whose value is this string, with any leading and trailing whitespace removed.
        System.out.println("        Here is an example.".trim());


    }

}

