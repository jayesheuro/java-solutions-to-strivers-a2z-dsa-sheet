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

    // static int lowerBound(int[] arr, int low, int high, int target) {
    // int mid = low + ((high - low) / 2);
    // if (low >= high) {
    // return low;
    // }
    // if (arr[mid] == target) {
    // return mid;
    // } else if (arr[mid] < target) {
    // return lowerBound(arr, mid + 1, high, target);
    // }
    // return lowerBound(arr, low, mid - 1, target);
    // }

    // static int findLowerBoundOptimal(int[] arr, int target, int n) {

    // int pos = lowerBound(arr, 0, n - 1, target);
    // return pos;
    // }

    static int findLowerBoundOptimal(int[] arr, int target, int n) {
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
        int[] arr = { 1, 3, 5, 7, 23, 67, 88, 100, 200 };
        int x = 600;
        int lowerBound = findLowerBoundOptimal(arr, x, arr.length);
        System.out.println(lowerBound);
    }
}
