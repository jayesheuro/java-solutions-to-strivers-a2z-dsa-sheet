package step3_arrays.lec_1_easy;

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

    static void rotateArrayBrute(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        if (k == 0 || arr.length == 1)
            return;

        // Step 1: Copy the first k elements to a temp array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the rest of the array to the left
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        // Step 3: Put the temp elements at the end of the original array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("INPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        rotateArrayLeft(arr, 2);
        // rotateArrayBrute(arr, 2);
        System.out.print("OUTPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
