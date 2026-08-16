package step3_arrays.lec_3_hard;

import java.util.Arrays;

public class RepeatingAndMissingNumber {
    static int[] findRepeatingAndMissing(int[] arr) {
        int[] ans = new int[2];
        // create a set > duplicate is removed
        // calculate sum of 1 to n
        // sum - setSum = missing number
        // Repeating

        // repeating - sort the array and break when found
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                ans[0] = arr[i];
            } else if (arr[i + 1] != arr[i] + 1) {
                ans[1] = arr[i] + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 4, 1, 1 };
        int[] ans = findRepeatingAndMissing(arr);
        System.out.println("Repeating: " + ans[0] + ", Missing: " + ans[1]);
    }
}
