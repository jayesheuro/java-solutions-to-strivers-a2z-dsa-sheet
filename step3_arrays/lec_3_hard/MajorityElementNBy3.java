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

    static List<Integer> findNby3MajorityElementOptimal(int[] arr) {
        int n = arr.length;
        int limit = n / 3;

        // PASS 1: Find the top 2 candidates using Boyer-Moore
        int e1 = Integer.MIN_VALUE, e2 = Integer.MIN_VALUE;
        int c1 = 0, c2 = 0;

        for (int i : arr) {
            // Check matches FIRST to avoid initialization traps
            if (e1 == i) {
                c1++;
            } else if (e2 == i) {
                c2++;
            }
            // If no match, check for an empty slot SECOND
            else if (c1 == 0) {
                e1 = i;
                c1 = 1;
            } else if (c2 == 0) {
                e2 = i;
                c2 = 1;
            }
            // If no matches and no empty slots, cancel out THIRD
            else {
                c1--;
                c2--;
            }
        }

        // PASS 2: Manually verify the surviving candidates
        c1 = 0;
        c2 = 0;

        for (int i : arr) {
            if (i == e1) {
                c1++;
            } else if (i == e2) {
                c2++;
            }
        }

        // Construct the final answer safely
        List<Integer> ans = new ArrayList<>();

        // Let Java handle the list indexing naturally
        if (c1 > limit) {
            ans.add(e1);
        }
        if (c2 > limit) {
            ans.add(e2);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 2, 2 };
        // Set<Integer> ans = findNby3MajorityElement(arr);
        List<Integer> ans = findNby3MajorityElementOptimal(arr);
        System.out.println(ans);
    }
}
