package step3_arrays.lec_1_easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSumKWithNegatives {

    static int findMaxSubArrayLengthHavingNegatives(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // Case 1: The current prefix sum itself equals k
            if (sum == k) {
                maxLen = i + 1;
            }

            // Case 2: Check if (sum - k) exists in the map
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // This ensures we keep the EARLIEST index for the longest subarray.
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -1, 5, -2, 3 };
        int k = 3;
        int length = findMaxSubArrayLengthHavingNegatives(arr, k);
        System.out.println(length);
    }
}
