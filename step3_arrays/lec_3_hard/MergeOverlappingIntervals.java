package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    static int[][] mergeOverlapping(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        // sorting the array lexicographically
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int n = intervals.length;

        // adding first element
        ans.add(new int[] {
                intervals[0][0],
                intervals[0][1]
        });

        for (int i = 1; i < n; i++) {
            int currentStart = intervals[i][0];
            int currentEnd = intervals[i][1];

            int[] last = ans.get(ans.size() - 1); // reference to last merged interval

            if (currentStart <= last[1]) {
                // overlapping
                last[1] = Math.max(currentEnd, last[1]);
            } else {
                ans.add(new int[] { currentStart, currentEnd });
            }
        }

        // convert List<int[]> into int[][]
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = { { 2, 6 }, { 1, 3 }, { 15, 18 }, { 8, 10 } };
        // int[][] intervals = { { 1, 4 }, { 4, 5 } };
        int[][] overlapped = mergeOverlapping(intervals);
        for (int[] a : overlapped) {
            for (int i : a) {
                System.out.print(i + ", ");
            }
            System.out.println();
        }
        // System.out.println(mergeOverlapping(intervals));
    }
}
