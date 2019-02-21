package org.kimbs.algorithms.mockexample;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MockExampleTest {
    
    private MockExample mockExample = new MockExample();

    @Test
    public void tc1MockExample() {
        int[] answer = {1, 2, 3, 4, 5};
        int[] actuals = mockExample.solution(answer);

        int[] expecteds = {1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void tc2MockExample() {
        int[] answer = {1, 3, 2, 4, 2};
        int[] actuals = mockExample.solution(answer);

        int[] expecteds = {1, 2, 3};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void tc3MockExample() {
        int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] actuals = mockExample.solution(answer);

        int[] expecteds = {1, 2, 3};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void tc4MockExample() {
        int[] answer = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] actuals = mockExample.solution(answer);

        int[] expecteds = {1, 2, 3};
        assertArrayEquals(expecteds, actuals);
    }
}