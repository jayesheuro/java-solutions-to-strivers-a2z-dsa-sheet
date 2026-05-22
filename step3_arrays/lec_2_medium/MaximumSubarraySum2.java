package step3_arrays.lec_2_medium;

public class MaximumSubarraySum2 {
    static int[] maxSubarraySum(int[] arr) {
        int globalMax = Integer.MIN_VALUE;
        int csum = 0;
        int start = 0;
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            csum += arr[i];
            if (csum > globalMax) {
                globalMax = csum;
                end = i;
            }
            if (csum < 0) {
                csum = 0;
                start = i;
            }
        }
        return new int[] { start, end };
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        int[] indices = maxSubarraySum(arr); // indices is [start, end]
        for (int i = indices[0]; i <= indices[1]; i++) {
            System.out.println(arr[i]);
        }
    }
}
