package step4_binary_search.on_answers;

import java.util.Arrays;

public class AggresiveCows {
    // helper that counts number of cows that can be placed keeping a minimum distance between them
    static boolean cowsCanBePlaced(int[] nums, int minDistance, int cows) {
        // place the first cow
        int latestCowPosition = nums[0];
        int cowsPlaced = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - latestCowPosition >= minDistance) {
                cowsPlaced++;
                latestCowPosition = nums[i];
            }
            if (cowsPlaced >= cows) {
                return true;
            }
        }
        return false;
    }

    static int findMinDistance(int[] nums, int k) {
        Arrays.sort(nums);
        int start = 1; // minimum distance between cows is 1
        int end = nums[nums.length - 1] - nums[0];

        // for (int i = start; i <= end; i++) {
        //     if (cowsCanBePlaced(nums, i, k)) {
        //         continue;
        //     } else {
        //         return i - 1;
        //     }
        // }
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (cowsCanBePlaced(nums, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 7, 10, 9};
        int k = 4;
        System.out.println(findMinDistance(nums, k));
    }
}
