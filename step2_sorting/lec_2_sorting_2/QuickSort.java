package step2_sorting.lec_2_sorting_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    static int findCorrectPosition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;
        while (i < j) {
            while (arr.get(i) <= pivot && i <= high) {
                i++;
            }
            while (arr.get(j) > pivot && j >= low) {
                j--;
            }
            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(j);
        arr.set(low, temp);
        arr.set(j, pivot);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = findCorrectPosition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    static void quickSort(List<Integer> arr) {
        qs(arr, 0, arr.size() - 1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.addAll(Arrays.asList(15, 12, 5, 7, 3, 19, 6));
        quickSort(arr);
        System.out.println(arr);
    }
}
