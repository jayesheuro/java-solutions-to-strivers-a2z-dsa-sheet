package step4_binary_search.on_answers;

public class FindPeakElement {
    static int findPeakElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 && arr[i] > arr[i + 1]) || (i == n - 1 && arr[i] > arr[n - 2])) {
                return i;
            }
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(arr));
    }
}
