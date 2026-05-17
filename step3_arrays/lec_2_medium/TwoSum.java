package step3_arrays.lec_2_medium;

import java.util.Arrays;
// import java.util.HashMap;
// import java.util.Map;

public class TwoSum {
    static boolean checkIfPairExists(int[] arr, int t) {
        boolean found = false;
        // // version 1 - brute - O(n^2), O(1)
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // if (arr[i] + arr[j] == t) {
        // found = true;
        // break;
        // }
        // }
        // }

        // // better - using hashmap
        // Map<Integer, Integer> arrMap = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (arrMap.containsKey(t - arr[i])) {
        // found = true;
        // break;
        // } else {
        // arrMap.put(arr[i], i);
        // }
        // }

        // optimal - two pointers
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] + arr[j] == t) {
                found = true;
                break;
            } else if (arr[i] + arr[j] < t) {
                i++;
            } else {
                j--;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        boolean found = checkIfPairExists(arr, 19);
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
