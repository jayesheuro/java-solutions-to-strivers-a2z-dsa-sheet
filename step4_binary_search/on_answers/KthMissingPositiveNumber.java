package step4_binary_search.on_answers;

public class KthMissingPositiveNumber {
    static boolean searchIfExists(int[] arr, int e) {
//        for (int i : arr) {
//            if (i == e) {
//                return true;
//            }
//        }
//        return false;
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == e){
                ans = mid;
            }
            if(arr[mid] > e) {
                high = mid - 1;
            } else {
                low =  mid + 1;
            }
        }
        return ans != -1;
    }

    static int findKthMissing(int[] arr, int n, int k) {
        int missingIndex = 0;
//        using linear search
//        for (int i = 1; i <= arr[n - 1]; i++) {
//            boolean exists = searchIfExists(arr, i);
//            if (!exists) {
//                missingIndex++;
//                if (missingIndex == k) {
//                    return i;
//                }
//            }
//        }
        int low = 1;
        int high = arr[n-1];
        while(low <= high) {
            int mid = low + (high - low)/2;
            boolean exists = searchIfExists(arr, mid);

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 10 };
        int k = 6;
        System.out.println(findKthMissing(arr, arr.length, k));
    }
}
