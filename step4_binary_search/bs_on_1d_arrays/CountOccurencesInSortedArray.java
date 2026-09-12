package step4_binary_search.bs_on_1d_arrays;

public class CountOccurencesInSortedArray {
    static int countOccurences(int[]arr, int target){
        int ans= 0;
        for(int i: arr){
            if(i==target) ans++; 
        }
        return ans;
    }
    static int countOccurencesOptimal(int[] arr, int target) {

        int n = arr.length;

        int low = 0;
        int high = n - 1;

        int ub = n;
        int lb = n;

        // Upper Bound
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        // Lower Bound
        low = 0;
        high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                lb = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (lb == n || arr[lb] != target) {
            return 0;
        }

        return ub - lb;
    }
    public static void main(String[] args) {
        int[]arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        System.out.println(countOccurencesOptimal(arr, 3));
    }
}