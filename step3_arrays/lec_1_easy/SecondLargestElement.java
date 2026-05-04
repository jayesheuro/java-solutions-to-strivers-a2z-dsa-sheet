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
        // // BRUTE O(nLogn)
        // Arrays.sort(arr);
        // int max = arr[arr.length - 1];
        // int i = arr.length - 1;
        // while (i >= 0) {
        // if (arr[i] != max) {
        // break;
        // }
        // i--;
        // }
        // return arr[i];

        // // better O(n) with 2 loops
        // int max = arr[0], secondMax = arr[0];
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > max) {
        // max = arr[i];
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] > secondMax && arr[i] < max) {
        // secondMax = arr[i];
        // }
        // }
        // return secondMax;

        // optimal O(n) with 1 loop >>> Historically when someone becomes the largest,
        // it makes someone second largest
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
        }
        return secondMax;
    }

    static int getSecondMin(int[] arr) {
        int min = arr[0];
        int secondMin = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            }
        }
        return secondMin;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 3, 5, 6, 6, 5, 7, 8, 1, 8, 9 };
        int secondMax = getSecondMax(arr);
        int secondMin = getSecondMin(arr);
        System.out.println(secondMax + ", " + secondMin);
    }
}
