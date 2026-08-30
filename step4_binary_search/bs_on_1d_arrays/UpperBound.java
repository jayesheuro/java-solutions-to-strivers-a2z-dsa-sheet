package step4_binary_search.bs_on_1d_arrays;

public class UpperBound {
    static int upperBound(int[] arr, int n, int x) {
        int ans = n;
        // for (int i = 0; i < n; i++) {
        // if (arr[i] > x) {
        // ans = i;
        // break;
        // }
        // }

        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 8, 9, 15, 19 };
        System.out.println(upperBound(arr, arr.length, 9));
    }
}
