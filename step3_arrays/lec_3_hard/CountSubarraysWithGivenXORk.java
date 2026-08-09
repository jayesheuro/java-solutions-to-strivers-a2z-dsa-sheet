package step3_arrays.lec_3_hard;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraysWithGivenXORk {
    static int countSubarrayWithGivenXorK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentXor = 0;
            for (int j = i + 1; j < arr.length; j++) {
                currentXor = currentXor ^ arr[j];
                if (currentXor == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int countSubarrayWithGivenXorKOptimal(int[] arr, int k) {
        int count = 0;
        int currentXor = 0;

        Map<Integer, Integer> xorTracker = new HashMap<>();

        xorTracker.put(0, 1);

        for (int i = 0; i < arr.length; i++) {
            currentXor = currentXor ^ arr[i];

            // formula: Past_XOR = Current_XOR ^ k
            int target = currentXor ^ k;

            if (xorTracker.containsKey(target)) {
                count += xorTracker.get(target);
            }

            xorTracker.put(currentXor, xorTracker.getOrDefault(currentXor, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 6;
        System.out.println(countSubarrayWithGivenXorK(arr, k));
    }
}
