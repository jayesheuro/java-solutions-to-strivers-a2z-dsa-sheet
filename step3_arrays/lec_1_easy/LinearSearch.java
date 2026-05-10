package step3_arrays.lec_1_easy;

public class LinearSearch {
    static int findIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 3;
        System.out.println(findIndex(arr, n));
    }
}
