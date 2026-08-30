package step4_binary_search.bs_on_1d_arrays;

public class SearchInsertPosition {
    static int searchInsertPosition(int[] arr, int n, int target) {
        int ans = n;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (arr[mid] >= target) {
                // probable answer
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7 };
        int x = 6;
        System.out.println("Insert position for x (lower bound of x) = " + searchInsertPosition(arr, arr.length, x));
    }
}
