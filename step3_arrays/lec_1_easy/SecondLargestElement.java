package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class SecondLargestElement {

    static int getSecondMax(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }
        // BRUTE
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        int i = arr.length - 1;
        while (i >= 0) {
            if (arr[i] != max) {
                break;
            }
            i--;
        }
        return arr[i];
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 3, 5, 6, 6, 5, 7, 8, 1, 8 };
        int secondMax = getSecondMax(arr);
        System.out.println(secondMax);
    }
}
