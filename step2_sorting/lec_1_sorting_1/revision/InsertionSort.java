package step2_sorting.lec_1_sorting_1.revision;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        if(arr.length <= 1) return;

        // we consider the first number is always sorted, 
        // hence our first number to find correct position (key) becomes index 1 (second number)
        for(int i = 1; i <= arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // keeping out of loop avoids unnecessary assignments
        }
        
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,2};
        insertionSort(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
