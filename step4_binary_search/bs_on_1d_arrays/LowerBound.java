package step4_binary_search.bs_on_1d_arrays;

public class LowerBound {
    static int findLowerBound(int[] arr, int target, int n) {
        int pos = n; // default
        for (int i = 0; i < n; i++) {
            if (arr[i] >= target) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 23, 67, 88, 100 };
        int x = 88;
        int lowerBound = findLowerBound(arr, x, arr.length);
        System.out.println(lowerBound);
    }
}
