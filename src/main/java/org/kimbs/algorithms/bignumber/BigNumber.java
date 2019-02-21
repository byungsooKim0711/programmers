package org.kimbs.algorithms.bignumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigNumber {
    public String solution(int[] numbers) {
        List<String> stringNumbers = new ArrayList<>();
        for (int i=0; i<numbers.length; i++) {
            stringNumbers.add(numbers[i] + "");
        }

        Collections.sort(stringNumbers, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        return stringNumbers.get(0).equals("0")
            ? "0" 
            : String.join("", stringNumbers);
    }
}