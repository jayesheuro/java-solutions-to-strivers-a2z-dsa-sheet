package step3_arrays.lec_2_medium;

public class MaximumSubarraySum {
    static int maxSubarraySum(int[] arr) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1)
            return arr[0];

        int sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curSubarraySum = 0;
            for (int j = i; j < arr.length; j++) {
                curSubarraySum += arr[j];
                if (curSubarraySum > sum) {
                    sum = curSubarraySum;
                }
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, -2, 7, -4 };
        int sum = maxSubarraySum(arr);
        System.out.println(sum);

        int[] arr2 = { -2, -3, -7, -2, -10, -4 };
        int sum2 = maxSubarraySum(arr2);
        System.out.println(sum2);
    }
}
