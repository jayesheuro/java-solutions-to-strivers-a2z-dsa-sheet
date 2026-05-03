package step3_arrays.lec_1_easy;

public class LargestElement {

    static int getLargestNumber(int[] arr) {
        int size = arr.length;
        if (size < 1)
            return -1; // the array is empty so MAX does not exist

        int max = arr[0];
        int i = 0;
        while (i <= size - 1) {
            max = arr[i] > max ? arr[i] : max;
            i++;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 3, 0 };
        System.out.println(getLargestNumber(arr));
    }
}
