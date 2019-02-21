package org.kimbs.algorithms.bignumber;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BigNumberTest {

    private BigNumber b = new BigNumber();

    @Test
    public void tc1BigNumberTest() {
        // arrange
        int[] numbers = {6, 10, 2};

        // act
        String actual = b.solution(numbers);

        // assert
        assertEquals("6210", actual);
    }

    @Test
    public void tc2BigNumberTest() {
        // arrange
        int[] numbers = {3, 30, 34, 5, 9};

        // act
        String actual = b.solution(numbers);

        // assert
        assertEquals("9534330", actual);
    }

    @Test
    public void tc3BigNumberTest() {
        // arrange
        int[] numbers = {0, 0, 0, 0};

        // act
        String actual = b.solution(numbers);

        // assert
        assertEquals("0", actual);
    }

}