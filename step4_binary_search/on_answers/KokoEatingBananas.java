package step4_binary_search.on_answers;

public class KokoEatingBananas {
    static int findHoursToEat(int[] arr, int RATE) {
        // [3,5,7,9]
        // 2
        // 2,3,4,5
        int hours = 0;
        for (int i = 0; i < arr.length; i++) {
            hours += Math.ceil((double) arr[i] / RATE);

        }
        return hours;
    }

    // adding structure
    static int calculateEatingRate(int[] arr, int n, int h) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        for (int i = 1; i <= max; i++) {
            if (findHoursToEat(arr, i) <= h) {
                return i;
            }
        }
        return 0;
    }

    static int calculateEatingRateOptimal(int[] arr, int n, int h) {
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        // my search space is 1 to max, and I want to find the element which gives
        // hoursToEat <= h
        int low = 1;
        int high = max;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int hours = findHoursToEat(arr, mid);
            if (hours <= h) {
                // probable answer, move left
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] nums = { 7, 15, 6, 3 };
        int h = 8;
        System.out.println(calculateEatingRateOptimal(nums, n, h));
    }
}
