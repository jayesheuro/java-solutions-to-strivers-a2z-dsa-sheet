package step4_binary_search.bs_on_1d_arrays;

public class FindHowManyTimesArrayIsRotated {
    // brute force - O(N) time complexity
    static int findHowManyTimesArrayIsRotated(int[]arr){
        int n = arr.length;
        int min = arr[0];
        int minIndex = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static void main(String[] args) {
        // int[]arr = {1,2,3,4,5,6,7,8};
        int[] rotatedArray = {4,5,6,7,0,1,2,3};
        System.out.println(findHowManyTimesArrayIsRotated(rotatedArray));
    }
}
