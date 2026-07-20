package step3_arrays.lec_3_hard;

public class LongestSubarrayWithGivenSum0 {

    static int findMaxSubArrayLengthSum0(int[] arr, int k) {
        // BRUTE FORCE O(n*n)
        int maxLength = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == k) {
                    int l = ((j - i) + 1);
                    maxLength = Math.max(maxLength, l);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 9, -3, 3, -1, 6, -5 };
        int len = findMaxSubArrayLengthSum0(arr, 0);
        System.out.println(len);
    }
}
