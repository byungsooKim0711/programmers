package org.kimbs.practice.arrayrotate;

public class ArrayRotate {

    public void leftRotate(int[] arr, int k) {
        /* Prevent k value ​​greater than array length  */
        k %= arr.length;

        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public void rightRotate(int[] arr, int k) {
        /* Prevent k value ​​greater than array length  */
        k %= arr.length;

        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k, arr.length-1);
        reverse(arr, 0, arr.length-1);
    }

    public void reverse(int[] arr, int start, int end) {
        while(start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start ++;
            end --;
        }
    }
}