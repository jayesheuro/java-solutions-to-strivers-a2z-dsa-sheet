package step3_arrays.lec_2_medium;

public class AlternatePositiveNegative {
    static int[] alternatePositiveNegative(int[] arr, int n) {
        // BRUTE - TC = O(N) + O(N), SC = O(N) additional
        // int[] temp = new int[n];
        // int positiveIndex = 0;
        // int negativeIndex = n - 1;
        // for (int i : arr) {
        // if (i < 0) {
        // temp[negativeIndex--] = i;
        // } else {
        // temp[positiveIndex++] = i;
        // }
        // }

        // positiveIndex = 0;
        // negativeIndex = n - 1;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0) {
        // arr[i] = temp[positiveIndex++];
        // } else {
        // arr[i] = temp[negativeIndex--];
        // }
        // }

        // OPTIMAL - using less space
        // since its given the array has equal positives and negatives, and the order
        // should be relatively same, we can determine the positions of elements in new
        // array using MATH

        int[] ans = new int[n];
        int positives = -1, negatives = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positives++;
                ans[2 * positives] = arr[i];
            } else {
                negatives++;
                ans[2 * negatives + 1] = arr[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };
        int[] output = alternatePositiveNegative(arr, arr.length);
        for (int i : output) {
            System.out.println(i + " ");
        }
    }
}
