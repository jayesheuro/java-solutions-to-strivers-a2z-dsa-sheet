package step2_sorting.lec_1_sorting_1.revision;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minIndex = i; //initialize min with first element of right part
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4,6,3};
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i + ", ");
        }
    }
}
