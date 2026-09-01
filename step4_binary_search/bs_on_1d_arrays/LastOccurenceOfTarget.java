package step4_binary_search.bs_on_1d_arrays;

public class LastOccurenceOfTarget {
    static int lastOccurenceOfTarget(int[] arr, int n, int target) {
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 13, 13, 13, 20, 40, 66, 98, 687};
        int n = arr.length;
        System.out.println(lastOccurenceOfTarget(arr, n, 13));
    }
}
