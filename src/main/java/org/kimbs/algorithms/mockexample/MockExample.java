package org.kimbs.algorithms.mockexample;

import java.util.ArrayList;
import java.util.List;

public class MockExample {
    private int[][] patterns = {{1, 2, 3, 4, 5},
                                {2, 1, 2, 3, 2, 4, 2, 5},
                                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public  int[] solution(int[] answers) {
        int[] point = new int[3];

        for (int i=0; i<answers.length; i++) {
            if (patterns[0][i%patterns[0].length] == answers[i]) {
                point[0]++;
            } 
            if (patterns[1][i%patterns[1].length] == answers[i]) {
                point[1]++;
            }
            if (patterns[2][i%patterns[2].length] == answers[i]) {
                point[2]++;
            }
        }

        int maxValue = Math.max(point[0], Math.max(point[1], point[2]));

        List<Integer> answer = new ArrayList<>();
        for (int i=0; i<point.length; i++) {
            if (maxValue == point[i]) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i -> i+1).toArray();
    }
}