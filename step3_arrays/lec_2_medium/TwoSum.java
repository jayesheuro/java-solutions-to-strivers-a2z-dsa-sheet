package step3_arrays.lec_2_medium;

public class TwoSum {
    static boolean checkIfPairExists(int[] arr, int t) {
        // version 1 - brute - O(n^2), O(1)
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == t) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        boolean found = checkIfPairExists(arr, 13);
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
