package step3_arrays.lec_3_hard;

import java.util.HashSet;
import java.util.Set;

public class MajorityElementNBy3 {
    static Set<Integer> findNby3MajorityElement(int[] arr) {
        int limit = arr.length / 3;
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
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

    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 3, 2, 2 };
        Set<Integer> ans = findNby3MajorityElement(arr);
        System.out.println(ans);
    }
}
