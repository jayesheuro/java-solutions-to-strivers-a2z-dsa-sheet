package step3_arrays.lec_2_medium;

import java.util.Arrays;

public class NextPermutation {

    static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    static void nextPermutation(int[] arr) {
        int n = arr.length;
        int index = -1;
        // find the index where the a dip exists if we traverse from the right end
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                index = i;
                break;
            }
        }
        if (index == -1) { // meaning the array is the maximum permutation of itself, we need to return the
                           // first permutation which is the reverse
            reverseArray(arr, 0, n - 1);
            return;
        }

        // find the smallest number greater than index element from the right elements,
        // and swap
        for (int i = n - 1; i > index; i--) {
            if (arr[i] > arr[index]) {
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                break;
            }
        }

        // reverse the right elements (sort increasingly)
        reverseArray(arr, index + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1 };
        nextPermutation(arr);
        System.out.println(Arrays.stream(arr).boxed().toList());
    }
}
