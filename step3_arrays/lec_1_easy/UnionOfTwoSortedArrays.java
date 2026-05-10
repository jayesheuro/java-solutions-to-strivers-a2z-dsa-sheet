package step3_arrays.lec_1_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    static int[] union(int a1[], int a2[]) {

        // // Using TreeSet - O((n1+n2)log(n1+n2)) ~ O(NlogN) where N is the union size
        // Set<Integer> s = new TreeSet<>();
        // for (int i : a1) {
        // s.add(i);
        // }
        // for (int i : a2) {
        // s.add(i);
        // }
        // int[] u = s.stream().mapToInt(i -> i).toArray();
        // return u;

        // Using a HashMap - O(N log N) same as set approach
        Map<Integer, Integer> m = new HashMap<>();
        for (int i : a1) {
            m.put(i, 1); // value doesn't really matter
        }
        for (int i : a2) {
            m.put(i, 1);
        }
        Set<Integer> s = m.keySet();
        int[] u = s.stream().mapToInt(i -> i).toArray();
        Arrays.sort(u);
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
