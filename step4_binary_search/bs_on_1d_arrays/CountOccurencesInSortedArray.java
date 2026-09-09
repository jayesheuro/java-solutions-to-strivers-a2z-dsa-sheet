package step4_binary_search.bs_on_1d_arrays;

public class CountOccurencesInSortedArray {
    static int countOccurences(int[]arr, int target){
        int ans= 0;
        for(int i: arr){
            if(i==target) ans++; 
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr = {2, 2 , 3 , 3 , 3 , 3 , 4};
        System.out.println(countOccurences(arr, 3));
    }
}