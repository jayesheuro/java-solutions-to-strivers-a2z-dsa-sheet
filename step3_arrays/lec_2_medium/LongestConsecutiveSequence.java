package step3_arrays.lec_2_medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

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

    static int getLengthOfLCSOptimal(int[] arr, int n) {
        if (n == 0)
            return 0;

        int longest = 1;

        // Build a Set for O(1) lookup
        java.util.Set<Integer> set = new java.util.HashSet<>();
        for (int i : arr) {
            set.add(i);
        }

        // Iterate over the set
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentLength = 1;

                // Count the sequence
                while (set.contains(num + 1)) {
                    currentLength++;
                    num++;
                }
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
        int l = getLengthOfLCS(arr, arr.length);
        System.out.println(l);
    }
}
