package step4_binary_search.bs_on_1d_arrays;

public class FindMnimumInRotatedSortedArray {
    static int findMin(int[]arr){
        if (arr.length == 0) return -1;
        int min = arr[0];
        for(int i: arr){
            min = Math.min(min, i);
        }
        return min;
    }

    static int findMinBetter(int[]arr){
        if (arr.length == 0) return -1;
        int min = arr[0];
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(i);
            if(arr[i+1] < arr[i]){
                min = arr[i + 1];
            }
        }
        return min;
    }

    static int findMinOptimal(int[]arr){
        if (arr.length == 0) return -1;
        int min = Integer.MAX_VALUE;
        int low = 0, high = arr.length - 1;
        
        while(low <= high) {
            int mid = low + ((high - low) / 2);
            min = Math.min(min, arr[mid]);
            if(arr[low] <= arr[mid]){
                // left half is sorted
                // lowest element is arr[low]
                min = Math.min(min, arr[low]);
                // eliminate left half now
                low = mid + 1;
            } else {
                // right half is sorted
                // arr[mid] should be smallest in the right sorted half
                min = Math.min(min, arr[mid]);
                // eliminate the right half
                high = mid - 1;
            }
        }
        return min;
    }
    
    public static void main(String[] args) {
        // System.out.println(findMinOptimal(new int[]{1,2,3,4,5,6,7,0}));
        System.out.println(findMinOptimal(new int[]{4,5,6,7,0,1,2,3}));
        // System.out.println(findMinOptimal(new int[]{6,7,0,1,2,3,4,5}));
    }
}
