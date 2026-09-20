package step4_binary_search.bs_on_1d_arrays;

public class SingleElementInSortedArray {
    static int singleElementInSortedArray(int[]arr, int n){
        int ans = -1;
        if(n == 0) return ans;
        
        // //elements should repeat on odd positions, and increase on even positions as per zero based indexing
        // for(int i = 0; i < n; i++){
        //     if((i==n-1) || (i % 2 == 0 && arr[i+1] != arr[i])) {
        //         return arr[i];
        //     }
        // }
        // return ans;

        // O(N) using xor
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ arr[i];
        }

        return xor;
    }
    public static void main(String[] args) {
        int[]arr = {1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7};
        System.out.println(singleElementInSortedArray(arr, arr.length));
    }
}
