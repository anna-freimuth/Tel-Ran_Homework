package ListNumbersSet;

import java.util.Arrays;

import java.util.HashSet;


public class ListNumbers {

    public HashSet<Integer> uniqueListOfNumbers(Integer[] list) {

        return new HashSet<>(Arrays.asList(list));
    }
}
