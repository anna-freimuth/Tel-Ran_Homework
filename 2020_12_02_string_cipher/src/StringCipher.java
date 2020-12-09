public class StringCipher {
    private String str;

    public StringCipher(String str) {
        this.str = str;
    }

    public String stringCipher() {
        int count = 0;
        String response = "";
        for (int i = 0; i < str.length(); i++) {
            if (i != str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) count++;
            else {
                response += str.charAt(i);
                if (count > 0) response += count + 1;
                count = 0;
            }
        }
        return response;
    }
}
