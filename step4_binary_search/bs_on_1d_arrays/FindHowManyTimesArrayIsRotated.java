package step4_binary_search.bs_on_1d_arrays;

public class FindHowManyTimesArrayIsRotated {
    // brute force - O(N)
    static int findHowManyTimesArrayIsRotated(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        int minIndex = 0;
        // calculates right rotated times
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static int findHowManyTimesArrayIsRotatedBetter(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (arr[left] > arr[left + 1]) {
                // right rotated by left+1 times
                // left rotated by n - left +1 times
                return n - left - 1;
            }
            if (arr[right - 1] > arr[right]) {
                // right rotated right times
                // left rotated n - right times
                return n - right;
            }
            left++;
            right--;
        }
        return 0;
    }

    static int findHowManyTimesArrayIsRotatedOptimal(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        while (low <= high) {
            // find minimum index and your answer is Right Rotated ans times
            int mid = low + ((high - low) / 2);
            if (arr[low] <= arr[mid]) {
                // left part is sorted
                // take minimum
                if (arr[low] < min) {
                    min = arr[low];
                    minIndex = low;
                }
                low = mid + 1;
            } else {
                // right part is sorted
                // take minimum
                if (arr[mid] < min) {
                    min = arr[mid];
                    minIndex = mid;
                }
                high = mid - 1;
            }
        }
        return minIndex == 0 ? 0 : n - minIndex;
    }

    public static void main(String[] args) {
        int[] rotatedArray = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int[] rotatedArray = { 2, 3, 4, 1 };
        // System.out.println(findHowManyTimesArrayIsRotated(rotatedArray));
        // System.out.println("Left rotated " +
        // findHowManyTimesArrayIsRotatedBetter(rotatedArray) + " times");
        System.out.println("Left rotated " + findHowManyTimesArrayIsRotatedOptimal(rotatedArray) + " times");
    }
}
