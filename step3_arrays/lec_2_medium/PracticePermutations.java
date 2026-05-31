package step3_arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticePermutations {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void solve(List<List<Integer>> ans, int[] arr, int index) {
        if (index >= arr.length) {
            ans.add(Arrays.stream(arr).boxed().toList());
            return;
        }
        for (int j = index; j < arr.length; j++) {
            swap(arr, index, j);
            solve(ans, arr, index + 1);

            // backtrack
            swap(arr, index, j);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 }; // an array of distinct integers
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans, arr, 0);
        System.out.println(ans);
    }
}
