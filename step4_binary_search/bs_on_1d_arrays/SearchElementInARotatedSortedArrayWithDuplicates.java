package step4_binary_search.bs_on_1d_arrays;

public class SearchElementInARotatedSortedArrayWithDuplicates {
    static int findElement(int[]arr, int k){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == k) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        System.out.println(findElement(arr, 3));
    }
}
