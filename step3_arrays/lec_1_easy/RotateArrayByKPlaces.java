package step3_arrays.lec_1_easy;

import java.util.Arrays;

public class RotateArrayByKPlaces {

    static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArrayLeft(int[] arr, int k) {
        k = k % arr.length; // for an array of 5 elements, k = 7 is essentially k = 2
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("INPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        rotateArrayLeft(arr, 2);
        System.out.print("OUTPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
