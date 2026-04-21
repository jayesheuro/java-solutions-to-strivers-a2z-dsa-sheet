package step2_sorting.lec_1_sorting_1.revision;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int i = 0; i <= arr.length - 1; i++) {
            boolean swapped = false;
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) return;
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {5,3,8,2,2};
        bubbleSort(arr);
        for(int i: arr){
            System.out.println(i);
        }
    }
}
