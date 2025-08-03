package learn_the_basics.lec_5;

import java.util.Arrays;

public class ReverseAnArrayRecursively {
    int[] swapTwoItemsInArray(int[] arr, int i, int j) {
        if (i >= j) return arr;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return swapTwoItemsInArray(arr, i + 1, j - 1);
    }

    int[] reverseArrayRecursively(int[] arr, int size) {
        return swapTwoItemsInArray(arr, 0, size - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        ReverseAnArrayRecursively r = new ReverseAnArrayRecursively();
        int[] reversedNumbers = r.reverseArrayRecursively(numbers, numbers.length);
        System.out.println(Arrays.toString(reversedNumbers));
    }
}
