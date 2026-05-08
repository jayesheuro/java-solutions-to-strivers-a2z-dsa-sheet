package step3_arrays.lec_1_easy;

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] arr) {

        int size = arr.length;
        if (size == 1)
            return 1;

        // not optimal, initial try
        // int uniques = 1;
        // for (int i = 0; i < size; i++) {
        // for (int j = i + 1; j <= size; j++) {
        // if (j == size) {
        // return uniques;
        // }
        // if (arr[j] > arr[i] && (j - i) > 1) {
        // int temp = arr[i + 1];
        // arr[i + 1] = arr[j];
        // arr[j] = temp;
        // uniques++;
        // break;
        // }
        // }
        // }

        // optimal
        int i = 0;
        for (int j = i + 1; j < size; j++) {
            if (arr[j] != arr[i]) {
                arr[i + 1] = arr[j];
                i++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 4, 4, 7, 7, 7, 8, 8, 9, 20 };
        int uniques = removeDuplicates(arr);
        System.out.println("Unique elements:" + uniques);
        for (int i = 0; i < uniques; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
