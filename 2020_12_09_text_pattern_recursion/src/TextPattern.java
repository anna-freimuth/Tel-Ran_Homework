public class TextPattern {
    private String text;
    private String pattern;
    private int textCurrentIndex;
    private int patternCurrentIndex;

    public TextPattern(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
        this.textCurrentIndex = text.length() - 1;
        this.patternCurrentIndex = pattern.length() - 1;
    }

    public boolean textPattern() {
        if (patternCurrentIndex < 0)
            return true;
        if (textCurrentIndex < patternCurrentIndex)
            return false;

        if (text.charAt(textCurrentIndex) == pattern.charAt(patternCurrentIndex)) {
            textCurrentIndex--;
            patternCurrentIndex--;
        } else {
            textCurrentIndex--;
        }

        return textPattern();
    }
}
