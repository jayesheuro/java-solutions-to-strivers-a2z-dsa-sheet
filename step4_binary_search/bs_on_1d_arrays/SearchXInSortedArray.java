package step4_binary_search.bs_on_1d_arrays;

public class SearchXInSortedArray {
    static int binarySearchIterative(int[] arr, int n, int target) {
        int pos = -1;

        if (n == 0)
            return pos;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            else if (target > arr[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }
        return pos;
    }

    static int binarySearchRecursive(int[] arr, int low, int high, int target) {
        // base case
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;
        else if (arr[mid] < target)
            return binarySearchRecursive(arr, mid + 1, high, target);
        return binarySearchRecursive(arr, low, mid - 1, target);
    }

    static int search(int[] arr, int n, int target) {
        if (n == 0)
            return -1;
        return binarySearchRecursive(arr, 0, n - 1, target);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 7, 8, 9, 18, 55, 789 };
        // int pos = binarySearchIterative(arr, arr.length, 55);
        int pos = search(arr, arr.length, 55);
        System.out.println(pos);
    }
}
