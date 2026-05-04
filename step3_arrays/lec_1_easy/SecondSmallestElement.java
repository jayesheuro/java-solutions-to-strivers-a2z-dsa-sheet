package step3_arrays.lec_1_easy;

public class SecondSmallestElement {
    static int getSecondSmallest(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        if (arr.length == 1) {
            return arr[0];
        }

        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;

    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 3, 3, 5, 6, 6, 5, 7, 8, 1, 8, 9 };
        int secondSmallest = getSecondSmallest(arr);
        System.out.println(secondSmallest);
    }
}
