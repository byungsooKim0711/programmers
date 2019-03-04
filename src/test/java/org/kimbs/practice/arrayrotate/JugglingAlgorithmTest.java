package org.kimbs.practice.arrayrotate;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class JugglingAlgorithmTest {

    @Test
    public void test() {

        /* arrange */
        JugglingAlgorithm rotate = new JugglingAlgorithm();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /* act */
        rotate.leftRotate(arr, 1);

        int[] expecteds = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1};
        assertArrayEquals(expecteds, arr);
    }
}