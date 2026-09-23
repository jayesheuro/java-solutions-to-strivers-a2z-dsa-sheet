package step4_binary_search.bs_on_1d_arrays;

public class SingleElementInSortedArray {
    static int singleElementInSortedArray(int[] arr, int n) {
        int ans = -1;
        if (n == 0)
            return ans;

        // //elements should repeat on odd positions, and increase on even positions as
        // per zero based indexing
        // for(int i = 0; i < n; i++){
        // if((i==n-1) || (i % 2 == 0 && arr[i+1] != arr[i])) {
        // return arr[i];
        // }
        // }
        // return ans;

        // O(N) using xor
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }

        return xor;
    }

    static int singleElementInSortedArrayOptimal(int[] arr, int n) {

        int low = 0;
        int high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Make mid even
            if (mid % 2 == 1) {
                mid--;
            }

            // Pair is correct -> single element is on the right
            if (arr[mid] == arr[mid + 1]) {
                low = mid + 2;
            }
            // Pair is broken -> single element is on the left
            else {
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 7 };
        System.out.println(singleElementInSortedArrayOptimal(arr, arr.length));
    }
}
