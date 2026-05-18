package step3_arrays.lec_2_medium;

public class SortAnArrayOfZeroOneAndTwo {

    static void sort012(int[] arr) {
        int n = arr.length;
        if (n <= 1)
            return;

        // // BRUTE - approach 1 LOL
        // Arrays.sort(arr); // O(N log N)

        // BETTER - 2 Full Passes - O(N) + O(N)
        int zeroes = 0, ones = 0, twos = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroes++;
            } else if (i == 1) {
                ones++;
            } else {
                twos++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i < zeroes) {
                arr[i] = 0;
            } else if (i < zeroes + ones) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 0 };
        sort012(arr);
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }
}
