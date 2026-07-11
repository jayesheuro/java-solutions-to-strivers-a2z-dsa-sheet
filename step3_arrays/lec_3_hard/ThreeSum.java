package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

public class ThreeSum {
    static List<List<Integer>> threeSum(int[] arr) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                        triplet.sort(Comparator.naturalOrder());
                        uniqueTriplets.add(triplet);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(uniqueTriplets);
        // List<List<Integer>> ans =
        // uniqueTriplets.stream().collect(Collectors.toList());
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> ans = threeSum(arr);
        System.out.println(ans);
    }
}