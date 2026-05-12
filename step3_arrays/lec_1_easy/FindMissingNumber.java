package step3_arrays.lec_1_easy;

public class FindMissingNumber {

    static int findMissingNumber(int[] arr) {
        int size = arr.length; // size is always n-1 since 1 number is missing from 1 to n
        if (size == 0)
            return 1; // array is empty meaning n = 1, so only 1 is missing

        int n = size + 1;
        // int missing = 1;

        // // brute
        // Arrays.sort(arr);

        // int j = 0;
        // for (int i = 1; i <= n; i++) {
        // if (arr[j++] != i) {
        // missing = i;
        // break;
        // }
        // }
        // return missing;
        // // TC - O(N logN) + O(N)

        // ---------------------------
        // Optimal - O(N) - using basic math - Arithmetic Progression Sum formula
        int sum = (n * (n + 1)) / 2;
        int sumOfArr = 0;
        for (int i : arr) {
            sumOfArr += i;
        }
        return sum - sumOfArr;
        // TC = O(n), SC = O(1)

    }

    public static void main(String[] args) {
        int[] arr = { 8, 2, 4, 5, 3, 7, 1 };
        int num = findMissingNumber(arr);
        System.out.println(num);
    }
}
