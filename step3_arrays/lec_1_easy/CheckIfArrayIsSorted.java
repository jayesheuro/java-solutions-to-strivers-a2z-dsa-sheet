package step3_arrays.lec_1_easy;

public class CheckIfArrayIsSorted {
    static boolean checkSorted(int[] arr) {
        int size = arr.length;
        if (size == 1)
            return true;
        boolean flag = true;
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 2, 3, 4, 7 };
        int[] sortedArr = { 4, 5, 7, 8, 9 };
        System.out.println("is arr sorted? - " + checkSorted(arr));
        System.out.println("is sortedArr sorted? - " + checkSorted(sortedArr));
    }
}
