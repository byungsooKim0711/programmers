package org.kimbs.algorithms.kakaoblind.numericalpha;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static final Map<String, Integer> alphaToInteger;

    static {
        alphaToInteger = new HashMap<>();
        alphaToInteger.put("zero", 0);
        alphaToInteger.put("one", 1);
        alphaToInteger.put("two", 2);
        alphaToInteger.put("three", 3);
        alphaToInteger.put("four", 4);
        alphaToInteger.put("five", 5);
        alphaToInteger.put("six", 6);
        alphaToInteger.put("seven", 7);
        alphaToInteger.put("eight", 8);
        alphaToInteger.put("nine", 9);
    }

    public int solution(String s) {
        String answer = s;
        for (String key : alphaToInteger.keySet()) {
            answer = answer.replaceAll(key, alphaToInteger.get(key) + "");
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {

    }
}