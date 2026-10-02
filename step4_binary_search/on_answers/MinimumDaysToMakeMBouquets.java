package step4_binary_search.on_answers;

public class MinimumDaysToMakeMBouquets {
    static int getNumberOfPossibleBouquets(int[] arr, int i) {
        int bouquets = 0;

        return bouquets;
    }

    static int findMinDaysToMake(int[] arr, int n, int k, int m) {
        int ans = -1;
        if (n < k * m)
            return ans;

        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(arr[i], max);
        }

        for (int i = 1; i < max; i++) {
            int bouquets = getNumberOfPossibleBouquets(arr, i);
            if (bouquets == m) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 7, 7, 7, 7, 13, 11, 12, 7 };
        int m = 2, k = 3, n = 8;
        System.out.println(findMinDaysToMake(nums, n, k, m));
    }
}