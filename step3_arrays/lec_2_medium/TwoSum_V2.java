package step3_arrays.lec_2_medium;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_V2 {
    static int[] checkIfPairExists(int[] arr, int t) {
        int[] pos = new int[2];
        pos[0] = -1;
        pos[1] = -1;
        // // variant 2 - brute - O(n^2), O(1)
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (arr[i] + arr[j] == t) {
        // pos[0] = i;
        // pos[1] = j;
        // break;
        // }
        // }
        // }

        // better and optimal - using hashmap
        Map<Integer, Integer> arrMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (arrMap.containsKey(t - arr[i])) {
                int smaller = Math.min(i, arrMap.get(t - arr[i]));
                int higher = Math.max(i, arrMap.get(t - arr[i]));
                pos[0] = smaller;
                pos[1] = higher;
                break;
            } else {
                arrMap.put(arr[i], i);
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int[] pos = checkIfPairExists(arr, 14);
        System.out.println("The two numbers are at " + pos[0] + ", " + pos[1]);
    }
}
