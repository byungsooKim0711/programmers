package org.kimbs.practice.arrayrotate;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class ArrayRotateTest {

    @Test
    public void leftRotateTest() {
        /* arrange */
        ArrayRotate rotate = new ArrayRotate();
        int[] arr = {1, 2, 3, 4, 5, 6};

        /* act */
        rotate.leftRotate(arr, 2);

        int[] expecteds = {3, 4, 5, 6, 1, 2};
        assertArrayEquals(expecteds, arr);
    }

    @Test
    public void rightRotateTest() {
        /* arrange */
        ArrayRotate rotate = new ArrayRotate();
        int[] arr = {1, 2, 3, 4, 5, 6};

        /* act */
        rotate.rightRotate(arr, 2);

        int[] expecteds = {5, 6, 1, 2, 3, 4};
        assertArrayEquals(expecteds, arr);
    }
}