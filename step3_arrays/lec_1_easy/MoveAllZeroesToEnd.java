package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

    static void moveZeroes(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;

        int[] arr2 = Arrays.stream(arr).filter(i -> i != 0).toArray();
        for (int i = 0; i < n; i++) {
            if (i >= arr2.length) {
                arr[i] = 0;
            } else {
                arr[i] = arr2[i];
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
