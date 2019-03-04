package org.kimbs.practice.arrayrotate;

public class ArrayRotate {

    public void leftRotate(int[] arr, int k) {
        reverse(arr, 0, k);
        reverse(arr, k, arr.length-k);
        reverse(arr, 0, arr.length);
    }

    public void reverse(int[] arr, int start, int end) {
        for (int i=0; i<(end/2); i++) {
            int tmp = arr[i+start];
            arr[i+start] = arr[end-i-1+start];
            arr[end-i-1+start] = tmp;
        }
    }
}