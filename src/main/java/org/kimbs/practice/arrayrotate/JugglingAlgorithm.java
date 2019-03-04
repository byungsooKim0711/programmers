package org.kimbs.practice.arrayrotate;

public class JugglingAlgorithm {
    
    public void leftRotate(int arr[], int d) {
        int j, k;

        for (int i=0; i < gcd(d, arr.length); i++) {
            int temp = arr[i];
            j = i;

            while (true) {
                k = j + d;
                if(k >= arr.length) {
                    k -= arr.length;
                }
                if (k == i) {
                    break;
                }
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd (b, a%b);
        }
    }
}