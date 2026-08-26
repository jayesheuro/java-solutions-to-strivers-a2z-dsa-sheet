package step3_arrays.lec_3_hard;

public class MaximumProductSubarray {
    static int mps(int[] arr) {
        if (arr.length <= 1) {
            return arr[0];
        }
        if (arr.length == 0) {
            return 0;
        }
        int maxProduct = arr[0];
        int currentProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            currentProduct = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                currentProduct *= arr[j];
                maxProduct = Math.max(currentProduct, maxProduct);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -4, -5, 1, 0, -8 };
        System.out.println(mps(arr));
    }
}
