package step3_arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class MaximumConsecutiveOnes {

    static int findMaxConsecutiveOnes(int[] arr) {

        // // BRUTE - uses an additional array of size = number of 1 subarrays.
        // // TC - O(n) + O(C log C)
        // // SC - O(C) where C = number of subarrays of 1s
        // List<Integer> l = new ArrayList<>();
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 1) {
        // count++;
        // if (i == arr.length - 1) {
        // l.add(count);
        // }
        // } else {
        // if (count != 0) {
        // l.add(count);
        // }
        // count = 0;
        // }
        // }

        // l.sort(null); // O(C log C)
        // return l.get(l.size() - 1);

        // OPTIMAL - uses O(1) extra space, and O(N) time complexity
        int n = arr.length;
        int k = 0; // current length of 1s subarray
        int max = 0; // max consecutive 1s subarray length
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                k++;
                if (k > max) {
                    max = k;
                }
            } else {
                k = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0,
                1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1,
                0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1 };

        int n = findMaxConsecutiveOnes(arr);
        System.out.println(n);
    }
}
