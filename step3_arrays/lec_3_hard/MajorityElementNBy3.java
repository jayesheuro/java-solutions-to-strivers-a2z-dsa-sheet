package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MajorityElementNBy3 {
    static Set<Integer> findNby3MajorityElement(int[] arr) {
        int limit = arr.length / 3;
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            if (ans.contains(arr[i])) {
                continue; // skip checking again if value already > n/3 times and added to the set
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > limit) {
                ans.add(arr[i]);
            }
        }
        return ans;
    }

    static List<Integer> findNby3MajorityElementBetter(int[] arr) {
        int limit = arr.length / 3;
        List<Integer> ans = new ArrayList<>();
        // count frequencies
        Map<Integer, Integer> fm = new HashMap<>();
        for (int i : arr) {
            fm.put(i, fm.getOrDefault(i, 0) + 1);
            if (fm.get(i) == limit + 1) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 2, 2 };
        // Set<Integer> ans = findNby3MajorityElement(arr);
        List<Integer> ans = findNby3MajorityElementBetter(arr);
        System.out.println(ans);
    }
}
