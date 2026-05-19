package step3_arrays.lec_2_medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MajorityElement1 {
    static int findMajorityElement(int[] arr) {
        // BRUTE: Time - O(N * N), Space - O(1)
        // int index = -1;
        // for (int i = 0; i < arr.length; i++) {
        // int curFreq = 0;
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] == arr[i]) {
        // curFreq++;
        // }
        // }
        // if (curFreq > arr.length / 2) {
        // index = i;
        // break;
        // }
        // }
        // return arr[index];

        // Better - HASHMAP to store frequencies, Time O(N), Space O(N)
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, ++freq);
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    public static void main(String[] args) {
        int[] arr = { 7, 0, 0, 1, 7, 7, 2, 7, 7 };
        int m = findMajorityElement(arr);
        System.out.println(m);
    }
}
