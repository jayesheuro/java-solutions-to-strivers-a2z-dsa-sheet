package step2_sorting.lec_1_sorting_1.revision;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int swapCount = 0;
        int compareCount = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; //initialize min with first element of right part
            for(int j = i + 1; j < arr.length; j++) {
                compareCount++;
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                swapCount++;
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.printf("Swapped %d many times and compared %d times \n", swapCount, compareCount);
    }

    public static void main(String[] args) {
        // int[] arr = {3,1,2,5,4,6,3};
        int[] arr = {
            50, 49, 48, 47, 46, 45, 44, 43, 42, 41, 
            40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 
            30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 
            20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1
        };
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i + ", ");
        }
    }
}
