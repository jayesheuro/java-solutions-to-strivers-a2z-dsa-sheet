package step3_arrays.lec_3_hard;

public class InversionOfArray {
    static int countInversions(int[] arr, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 4, 1 };
        System.out.print(countInversions(arr, arr.length));
    }
}
