package step3_arrays.lec_2_medium;

public class SubArraySumEqualsK {
    static int countSubarraysWithSumK(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 4, arr[] = { 3, 1, 2, 4 }, k = 6;
        // int n = 3, arr[] = { 1, 2, 3 }, k = 3;
        int ans = countSubarraysWithSumK(arr, n, k);
        System.out.println(ans);
    }
}
