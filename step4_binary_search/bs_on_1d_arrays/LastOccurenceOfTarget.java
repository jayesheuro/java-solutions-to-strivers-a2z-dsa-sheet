package step4_binary_search.bs_on_1d_arrays;

public class LastOccurenceOfTarget {
    // brute force, O(N)
    static int lastOccurenceOfTarget(int[] arr, int n, int target) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    static int lastOccurenceOfTargetOptimal(int[] arr, int n, int target) {
        int high = n - 1;
        int low = 0;
        int pos = -1;
        while (low <= high) {
            int mid = low + high - low / 2;
            if (arr[mid] == target) {
                pos = mid;
                // break;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        // if (pos != -1) {
        // for (int i = pos; i < n - 1; i++) {
        // if (arr[i] != target) {
        // return pos;
        // }
        // }
        // }
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 13, 13, 13, 20, 40, 66 };
        int n = arr.length;
        System.out.println(lastOccurenceOfTargetOptimal(arr, n, 13));
    }
}
