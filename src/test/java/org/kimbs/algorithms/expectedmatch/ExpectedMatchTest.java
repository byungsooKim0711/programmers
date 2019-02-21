package org.kimbs.algorithms.expectedmatch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExpectedMatchTest {
    
    private ExpectedMatch em = new ExpectedMatch();

    @Test
    public void tc1ExpectedMatchTest() {
        // arrange
        int n = 8;
        int a = 4;
        int b = 7;

        // act
        int actual = em.solution(n, a, b);

        // assert
        assertEquals(3, actual);
    }
}