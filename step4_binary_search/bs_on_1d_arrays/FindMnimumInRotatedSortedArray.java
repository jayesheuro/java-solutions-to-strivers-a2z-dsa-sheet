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
    public static void main(String[] args) {
        int[]arr = {4,5,6,7,0,1,2,3};
        System.out.println(findMin(arr));
    }
}
