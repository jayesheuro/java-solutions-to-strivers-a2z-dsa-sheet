public class BubbleSortRecursive {

    // static void recursiveSwap(int[] arr, int n, int j) {
    //     if(j == n - 1) {
    //         return;
    //     }
    //     if(arr[j] > arr[j+1]) {
    //         int temp = arr[j];
    //         arr[j] = arr[j+1];
    //         arr[j+1] = temp;
    //     }
    //     recursiveSwap(arr, n, j + 1);
    // }

    static void bsr(int[] arr, int n) {
        //base case -> if n == 1
        if(n == 1) return;
        
        boolean swapped = false;
        for(int j = 0; j < n - 2; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
        }
        if(!swapped) return;

        //over recusrion - takes O(n2) space and takes O(n2) time as well - AVOID RECURSION INSIDE RECURSION
        //also will lead to stack overflow
        // recursiveSwap(arr, n, 0);
        bsr(arr, n-1);
    }

    static void bubbleSortRecursive (int[] arr) {
        int size = arr.length;
        bsr(arr, size);
    }

    public static void main(String[] args) {
        int[] arr = {-5,1,4,2,3,5};
        bubbleSortRecursive(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}