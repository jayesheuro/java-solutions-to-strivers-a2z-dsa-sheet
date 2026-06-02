package step3_arrays.lec_2_medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    static void getAllLeadersOnePass(int[] arr, List<Integer> ans) {

    }

    static void getAllLeaders(int[] arr, List<Integer> ans) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                ans.add(arr[i]);
                break;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    break;
                }
                if (j == arr.length - 1) {
                    ans.add(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 22, 12, 3, 0, 6 };
        List<Integer> ans = new ArrayList<>();

        getAllLeaders(arr, ans);

        System.out.println(ans);
    }
}
