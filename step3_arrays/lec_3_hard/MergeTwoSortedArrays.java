package step3_arrays.lec_3_hard;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MergeTwoSortedArrays {
    static void shiftArrayCustom(int[] arr, int[] arr2, int index, int index2) {
        // arr.length + index2
        int num = arr2[index2];
        for (int i = arr.length - arr2.length + index2; i > index; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        arr[index] = num;
    }

    static void mergeSortedArrays(int[] a, int[] b) {
        int n1 = a.length;
        int n2 = b.length;

        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                if (a[j] > b[i]) {
                    shiftArrayCustom(a, b, j, i);
                    break;
                }
                if (j == n1 - 1) {
                    // element is largest
                    a[n1 - 1] = b[i];
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[] a = { -5, -2, 4, 5, 0, 0, 0 };
        // int[] b = { -3, 1, 8 };
        int[] a = { 0, 2, 7, 8, 0, 0, 0 };
        int[] b = { -7, -3, -1 };
        mergeSortedArrays(a, b);
        System.out.println(Arrays.stream(a).boxed().collect(Collectors.toList()));
    }
}
