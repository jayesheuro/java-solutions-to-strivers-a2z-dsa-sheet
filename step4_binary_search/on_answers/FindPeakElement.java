package step4_binary_search.on_answers;

public class FindPeakElement {

    // brute force solution
    static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 && arr[i] > arr[i + 1]) || (i == n - 1 && arr[i] > arr[n - 2])) {
                return i;
            }
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    static int findPeakElementOptimal(int[] arr) {
        int n = arr.length;
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            if ((mid == 0 || arr[mid] > arr[mid - 1]) &&
                    (mid == n - 1 || arr[mid] > arr[mid + 1])) {
                return mid;
            }

            // If the next element is greater,
            // a peak exists on the right side
            else if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }

            // Otherwise, search the left side
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElementOptimal(arr));
    }
}
