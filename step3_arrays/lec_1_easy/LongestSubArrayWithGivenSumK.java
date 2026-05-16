package step3_arrays.lec_1_easy;

public class LongestSubArrayWithGivenSumK {
    static int findMaxSubArrayLength(int[] arr, int k) {
        // BRUTE
        // int maxLength = 0;
        // int currentSum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i; j < arr.length; j++) {
        // currentSum += arr[j];
        // if (currentSum > k) {
        // currentSum = 0;
        // break;
        // }
        // if (currentSum == k) {
        // int l = ((j - i) + 1);
        // maxLength = l > maxLength ? l : maxLength;
        // currentSum = 0;
        // break;
        // }
        // }
        // }
        // return maxLength;

        // optimal - O(N)
        int sum = 0;
        int len = 0;
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            sum += arr[i];
            while (sum > k && j <= i) {
                sum -= arr[j];
                j++;
            }

            if (sum == k) {
                len = Math.max(len, i - j + 1);
            }
            i++;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int length = findMaxSubArrayLength(arr, k);
        System.out.println(length);
    }
}
