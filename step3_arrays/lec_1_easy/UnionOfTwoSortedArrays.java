package step3_arrays.lec_1_easy;

import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    static int[] union(int a1[], int a2[]) {
        Set<Integer> s = new TreeSet<>();
        for (int i : a1) {
            s.add(i);
        }
        for (int i : a2) {
            s.add(i);
        }
        int[] u = s.stream().mapToInt(i -> i).toArray();
        return u;
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 4, 5, 8 };
        int[] a2 = { 2, 3, 4, 4, 5, 6, 7 };

        int[] u = union(a1, a2);
        for (int i : u) {
            System.out.print(i + " ");
        }
    }
}
