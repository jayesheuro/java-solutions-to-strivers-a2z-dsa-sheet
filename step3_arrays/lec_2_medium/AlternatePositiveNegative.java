package step3_arrays.lec_2_medium;

public class AlternatePositiveNegative {
    static int[] alternatePositiveNegative(int[] arr, int n) {
        // BRUTE - TC = O(N) + O(N), SC = O(N) additional
        int[] temp = new int[n];
        int positiveIndex = 0;
        int negativeIndex = n - 1;
        for (int i : arr) {
            if (i < 0) {
                temp[negativeIndex--] = i;
            } else {
                temp[positiveIndex++] = i;
            }
        }

        positiveIndex = 0;
        negativeIndex = n - 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] = temp[positiveIndex++];
            } else {
                arr[i] = temp[negativeIndex--];
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };
        int[] output = alternatePositiveNegative(arr, arr.length);
        for (int i : output) {
            System.out.println(i + " ");
        }
    }
}
