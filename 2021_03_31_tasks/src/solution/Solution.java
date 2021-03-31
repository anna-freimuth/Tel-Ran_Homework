package solution;

import java.util.Collections;
import java.util.List;

public class Solution {

    /**
     * Need to split text, so
     * 1. text has max possible length, but not bigger then index
     * 2. text contains the whole words
     *
     * @param text  contains words and spaces
     * @param index
     * @return Example:
     * (Hello world, 2) ->
     * (Hello world, 5) -> Hello
     * (Hello world, 8) -> Hello
     * (Hello world, 11) -> Hello world
     */

    public String task1(String text, int index) {

        String[] splitSubstring = text.substring(0, index).split(" ");
        String[] splitWords = text.split(" ");
        List<String> words = new java.util.ArrayList<>(Collections.emptyList());
        for (int i = 0; i < splitSubstring.length; i++) {
            if (splitSubstring[i].equals(splitWords[i]))
                words.add(splitSubstring[i]);
        }
        return String.join(" ", words);
    }

    /**
     * Need to split text via subsequence of string pattern and add in list
     * @param text has no spaces
     * @param pattern
     * @return null, if impossible to split text
     *
     * "lHo" non substring of "Hello"
     * "Hlo" substring of "Hello"
     *
     * Example:
     * text = "helloworld", pattern = "helworeld"
     * result = {hel,lo, world}
     */

//    public List<String> task2(String text, String pattern){
//            return null;
//    }
}

