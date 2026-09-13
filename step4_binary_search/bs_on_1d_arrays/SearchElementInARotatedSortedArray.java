package step4_binary_search.bs_on_1d_arrays;

public class SearchElementInARotatedSortedArray {
    static int findElement(int[]arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
    static int findElementOptimal(int[]arr, int k){
        /*
        The golden rule of a rotated sorted array is this: if you pick any middle index, at least one half of the array (either the left half or the right half) will always be strictly sorted.
        */
        int low = 0;
        int high = arr.length - 1;
        while(low <= high) {
            int mid = low + ((high - low)/2);
            if(arr[mid] == k) return mid;
            if(arr[low] <= arr[mid]){
                //left part is sorted
                if(k >= arr[low] && k < arr[mid]){
                    // k lies in the left part itself so search in left part
                    high = mid - 1;
                } else {
                    // k does not lie in the left part, so we need to search right
                    low = mid + 1;
                }
            } else {
                // right part is sorted
                if(k > arr[mid] && k <= arr[high]){
                    // k lies in the right part itself so search in right part
                    low = mid + 1;
                } else {
                    // k does not lie in the right part, so we need to search left
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2,3};
        System.out.println(findElementOptimal(arr, 7));
    }    
}
