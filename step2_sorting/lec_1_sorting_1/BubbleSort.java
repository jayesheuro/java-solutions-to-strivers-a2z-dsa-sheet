package step2_sorting.lec_1_sorting_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSort {
    List<Integer> bubbleSort(List<Integer> arr){
        int size = arr.size(); //8, 0 to 7
        for (int i = 0; i <= size-2; i++) {
            boolean swapped = false;
            for (int j = 0; j <= size - 2 - i; j++) {
//                System.out.println(arr.get(j) + " , " + arr.get(j + 1) + " , " + arr);
                if (arr.get(j) > arr.get(j + 1)) {
//                    System.out.println("Swap");
                    Collections.swap(arr, j, j+1);
//                    int temp = arr.get(j + 1);
//                    arr.set(j + 1, arr.get(j));
//                    arr.set(j, temp);
                    swapped = true;
                }
            }
            if(!swapped) break; //array is already sorted
        }

        return arr;
    }
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        List<Integer> arr = new ArrayList<>(Arrays.asList(9,4,2,3,6,4,2,8));
//        List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(bs.bubbleSort(arr));
    }
}
