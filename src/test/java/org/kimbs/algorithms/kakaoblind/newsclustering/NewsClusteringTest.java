package org.kimbs.algorithms.kakaoblind.newsclustering;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NewsClusteringTest {

    private NewsClustering nc = new NewsClustering();

    @Test
    public void tc1NewsClusteringTest() {

        // arrange
        String str1 = "FRANCE";
        String str2 = "french";

        // act
        int actual = nc.solution(str1, str2);

        // assert
        assertEquals(16384, actual);
    }

    @Test
    public void tc2NewsClusteringTest() {

        // arrange
        String str1 = "handshake";
        String str2 = "shake hands";

        // act
        int actual = nc.solution(str1, str2);

        // assert
        assertEquals(65536, actual);
    }

    @Test
    public void tc3NewsClusteringTest() {

        // arrange
        String str1 = "aa1+aa2";
        String str2 = "AAAA12";

        // act
        int actual = nc.solution(str1, str2);

        // assert
        assertEquals(43690, actual);
    }

    @Test
    public void tc4NewsClusteringTest() {

        // arrange
        String str1 = "E=M*C^2";
        String str2 = "e=m*c^2";

        // act
        int actual = nc.solution(str1, str2);

        // assert
        assertEquals(65536, actual);
    }
}