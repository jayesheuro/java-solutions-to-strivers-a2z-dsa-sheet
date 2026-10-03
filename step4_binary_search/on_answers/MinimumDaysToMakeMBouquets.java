package step4_binary_search.on_answers;

public class MinimumDaysToMakeMBouquets {
    static boolean bouquetsPossible(int[] arr, int days, int k, int m) {
        int bouquets = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }
        bouquets += count / k;
        if (bouquets >= m)
            return true;
        return false;
    }

    static int findMinDaysToMake(int[] arr, int n, int k, int m) {
        int ans = -1;
        if (n < k * m)
            return ans;

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        for (int i = min; i < max; i++) {
            boolean possible = bouquetsPossible(arr, i, k, m);
            if (possible) {
                return i;
            }
        }
        return -1;
    }

    static int findMinDaysToMakeOptimal(int[] arr, int n, int k, int m) {
        int ans = -1;
        if (n < k * m)
            return ans;

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }

        int low = min;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            boolean possible = bouquetsPossible(arr, mid, k, m);
            if (possible) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 3, k = 2, n = 8;
        System.out.println(findMinDaysToMakeOptimal(nums, n, k, m));
    }
}