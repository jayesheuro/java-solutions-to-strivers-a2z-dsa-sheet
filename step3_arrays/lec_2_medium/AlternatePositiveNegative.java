package step3_arrays.lec_2_medium;

public class AlternatePositiveNegative {
    static int[] alternatePositiveNegative(int[] arr, int n) {
        // BRUTE - TC = O(N) + O(N), SC = O(N) additional
        // int[] temp = new int[n];

        // This approach is optimal if we do not know the number of positives and
        // negatives whether they are equal or not. In this case we will also need to
        // move the remaining numbers to the end. Extra space O(N/2) + O(N/2) will be
        // needed.
        int[] P = new int[n / 2];
        int[] N = new int[n / 2];
        int pn = 0, cn = 0;
        for (int i : arr) {
            if (i < 0) {
                N[cn++] = i;
            } else {
                P[pn++] = i;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = P[i];
            arr[2 * i + 1] = N[i];
        }
        return arr;

        // OPTIMAL - using less space
        // since its given the array has equal positives and negatives, and the order
        // should be relatively same, we can determine the positions of elements in new
        // array using MATH

        // int[] ans = new int[n];
        // int positives = -1, negatives = -1;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > 0) {
        // positives++;
        // ans[2 * positives] = arr[i];
        // } else {
        // negatives++;
        // ans[2 * negatives + 1] = arr[i];
        // }
        // }
        //
        // return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };
        int[] output = alternatePositiveNegative(arr, arr.length);
        for (int i : output) {
            System.out.println(i + " ");
        }
    }
}
