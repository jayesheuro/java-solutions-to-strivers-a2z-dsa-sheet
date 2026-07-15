package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum {
    static List<List<Integer>> fourSum(int[] arr, int t) {

        Set<List<Integer>> ans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    for (int l = k + 1; l < arr.length; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == t) {
                            // found
                            List<Integer> item = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                            item.sort(Comparator.naturalOrder());
                            ans.add(item);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 0, -1, 0, -2, 2 };
        int[] arr = { 4, 3, 3, 4, 4, 2, 1, 2, 1, 1 };

        int target = 9;
        List<List<Integer>> quadruplets = fourSum(arr, target);
        System.out.println(quadruplets);
    }
}