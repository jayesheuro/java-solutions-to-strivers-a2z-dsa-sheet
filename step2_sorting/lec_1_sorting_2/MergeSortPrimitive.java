package step2_sorting.lec_1_sorting_2;

import java.util.Arrays;

public class MergeSortPrimitive {

    static void merge(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        
        int left = low;
        int right = mid + 1;
        int k = 0; //index for pushing to temp

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k++] = arr[left++];
            } else {
                temp[k++] = arr[right++];
            }
        }

        while (left <= mid) {
            temp[k++] = arr[left++];
        }

        while (right <= high) {
            temp[k++] = arr[right++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
            // here low + i is important. It prevents overriding the left part of array which is not to be modified if a this merge be of any right part
        }
    }

    static void mergeSortRecursive(int[] arr, int low, int high) {
        if (low >= high) return;

        // preventing potential integer overflow, an alternative to int mid = (low + high) / 2
        int mid = low + (high - low) / 2;

        mergeSortRecursive(arr, low, mid);
        mergeSortRecursive(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void mergeSort(int[] arr, int n) {
        mergeSortRecursive(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        
        mergeSort(arr, arr.length);
        
        System.out.println("After Sorting:  " + Arrays.toString(arr));
    }
}