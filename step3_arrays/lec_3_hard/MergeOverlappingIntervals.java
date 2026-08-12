package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    // this does not work on unsorted intervals
    // this gives incorrect answer for cases like (1,4) (2,5) (3,6)
    static List<List<Integer>> mergeOverlapping(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();
        if (arr.length == 1) {
            list.add(Arrays.asList(arr[0][0], arr[0][1]));
            return list;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][1] >= arr[i + 1][0]) {
                // merge
                list.add(Arrays.asList(arr[i][0], arr[i + 1][1]));
            } else {
                list.add(Arrays.asList(arr[i + 1][0], arr[i + 1][1]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] arr = { { 1, 4 }, { 4, 5 } };
        System.out.println(mergeOverlapping(arr));
    }
}
