package step3_arrays.lec_3_hard;

public class CountSubarraysWithGivenXORk {
    static int countSubarrayWithGivenXorK(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentXor = 0;
            for (int j = i + 1; j < arr.length; j++) {
                currentXor = currentXor ^ arr[j];
                if (currentXor == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 7, 8, 9 };
        int k = 6;
        System.out.println(countSubarrayWithGivenXorK(arr, k));
    }
}
