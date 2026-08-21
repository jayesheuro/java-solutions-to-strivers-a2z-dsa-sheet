package step3_arrays.lec_3_hard;

import java.util.HashSet;
import java.util.Set;

public class RepeatingAndMissingNumber {
    // this is already a O(n) solution
    static int[] findRepeatingAndMissing(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int sum1toN = (n * (n + 1)) / 2;
        Set<Integer> set = new HashSet<>();
        int setSum = 0;
        for (int num : arr) {
            boolean added = set.add(num);
            if (added) {
                setSum += num;
            } else {
                ans[0] = num;
            }
        }
        ans[1] = sum1toN - setSum;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 1 };
        int[] ans = findRepeatingAndMissing(arr);
        System.out.println("Repeating: " + ans[0] + ", Missing: " + ans[1]);
    }
}
