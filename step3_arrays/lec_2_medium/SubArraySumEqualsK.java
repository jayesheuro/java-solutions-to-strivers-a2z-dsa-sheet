package step3_arrays.lec_2_medium;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumEqualsK {
    static int countSubarraysWithSumK(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }

        return count;
    }

    static int countSubarraysWithSumKOptimal(int[] arr, int n, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 4, arr[] = { 3, 1, 2, 4 }, k = 6;
        // int n = 3, arr[] = { 1, 2, 3 }, k = 3;;
        int ans = countSubarraysWithSumK(arr, n, k);
        System.out.println(ans);
    }
}
