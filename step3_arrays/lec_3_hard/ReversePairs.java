package step3_arrays.lec_3_hard;

public class ReversePairs {
    // brute force O(n^2) solution
    static int countReversePairs(int[] arr) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > 2 * arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // int[] arr = { 1, 3, 2, 3, 1 };
        int[] arr = { 3, 2, 1, 4 };
        System.out.println(countReversePairs(arr));
    }
}
