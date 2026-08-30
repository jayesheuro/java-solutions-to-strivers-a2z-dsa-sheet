package step4_binary_search.bs_on_1d_arrays;

public class FloorAndCeil {

    static void floorAndCeil(int[] arr, int n, int x) {

        int floorIndex = -1;
        int ceilIndex = n;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                // Possible ceiling
                ceilIndex = mid;
                high = mid - 1;

            } else {
                // Possible floor
                floorIndex = mid;
                low = mid + 1;
            }
        }

        if (floorIndex != -1) {
            System.out.println("Floor: " + arr[floorIndex]);
        } else {
            System.out.println("Floor: Does not exist");
        }

        if (ceilIndex != n) {
            System.out.println("Ceiling: " + arr[ceilIndex]);
        } else {
            System.out.println("Ceiling: Does not exist");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 4, 7, 8, 10 };
        int x = 5;
        floorAndCeil(arr, arr.length, x);
    }
}
