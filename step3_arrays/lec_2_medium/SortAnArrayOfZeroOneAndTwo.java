package step3_arrays.lec_2_medium;

import java.util.Arrays;

public class SortAnArrayOfZeroOneAndTwo {

    static void sort012(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;

        // BRUTE - approach 1 LOL
        Arrays.sort(arr); // O(N log N)
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
