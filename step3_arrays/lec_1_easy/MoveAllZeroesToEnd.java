package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    static void moveZeroes(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;

        // BRUTE - use O(n) extra space
        // int[] arr2 = Arrays.stream(arr).filter(i -> i != 0).toArray();
        // for (int i = 0; i < n; i++) {
        // if (i >= arr2.length) {
        // arr[i] = 0;
        // } else {
        // arr[i] = arr2[i];
        // }
        // }

        // OPTIMAL - O(n) time, no extra space
        // find first zero
        int i = -1;
        for (int k = 0; k < n; k++) {
            if (arr[k] == 0) {
                i = k;
                break;
            }
        }

        // loop from i + 1, and keep swapping i with non zero numbers
        for (int j = i + 1; j < n; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                arr[j] = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };

        moveZeroes(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
