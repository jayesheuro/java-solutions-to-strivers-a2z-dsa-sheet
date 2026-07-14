package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ThreeSum {
    // O(n*n*n) TC
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
        return ans;
    }

    // O(n*n) TC
    static List<List<Integer>> threeSumBetter(int[] arr) {
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            visited.clear();
            for (int j = i + 1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if (visited.contains(third)) {
                    // we found a triplet
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], third);
                    triplet.sort(Comparator.naturalOrder());
                    uniqueTriplets.add(triplet);
                }
                visited.add(arr[j]);
            }
        }
        return uniqueTriplets.stream().collect(Collectors.toList());
    }

    static List<List<Integer>> threeSumOptimal(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    // triplet found
                    List<Integer> triplet = Arrays.asList(arr[i], arr[j], arr[k]);
                    // this is already sorted
                    ans.add(triplet);
                    j++;
                    k--;
                    while (j < k && arr[j - 1] == arr[j]) {
                        j++;
                    }
                    while (j < k && arr[k + 1] == arr[k]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // int[] arr = { -1, 0, 1, 2, -1, -4 };
        // List<List<Integer>> ans = threeSumBetter(arr);
        int[] arr = { -2, -2, -2, -1, -1, -1, 0, 0, 0, 2, 2, 2, 2 };
        System.out.println(threeSumOptimal(arr));
    }
}