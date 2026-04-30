import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class InsertionSortRecursive {
    static void isr(List<Integer> arr, int n, int i) {
        if(i == n) return;
        int j = i;
        while(j > 0 && arr.get(j) < arr.get(j - 1)) {
            int temp = arr.get(j);
            arr.set(j, arr.get(j-1));
            arr.set(j - 1, temp);
            j--;
        }
        isr(arr, n, i + 1);
    }

    static void insertionSortRecursive(List<Integer> arr) {
        int n = arr.size();
        if(n == 1) return;
        isr(arr, n, 1);
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(14, 9, 15, 12, 6, 8, 13));
        insertionSortRecursive(arr);
        System.out.println(arr);
    }   
}
