package org.kimbs.practice.arrayrotate;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayRotateTest {

    @Test
    public void test() {
        /* arrange */
        ArrayRotate rotate = new ArrayRotate();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        /* act */
        rotate.leftRotate(arr, 13);

        int[] expecteds = {14, 15, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        assertArrayEquals(expecteds, arr);
    }
}