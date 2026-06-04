package step3_arrays.lec_2_medium;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    static int getLengthOfLCS(int[] arr, int n) {
        if (n == 0)
            return 0;

        int maxLength = 1;
        int curlength = 1;
        Arrays.sort(arr);

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                curlength++;
                maxLength = Math.max(maxLength, curlength);
            } else if (arr[i] == arr[i - 1]) {
                continue;
            } else {
                curlength = 1;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int l = getLengthOfLCS(arr, arr.length);
        System.out.println(l);
    }
}
