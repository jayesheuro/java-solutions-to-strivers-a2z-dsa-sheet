package step3_arrays.lec_1_easy;

public class RotateArrayByOnePlace {

    static void rotateArrayLeft(int[] arr, int k) {
        if (arr.length == 1) {
            return;
        }

        int firstElement = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.print("INPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        rotateArrayLeft(arr, 1);
        System.out.print("OUTPUT: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
