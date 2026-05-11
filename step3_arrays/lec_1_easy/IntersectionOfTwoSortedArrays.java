package step3_arrays.lec_1_easy;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

    static int[] intersection(int[] a1, int[] a2) {
        if (a1.length == 0 || a2.length == 0)
            return new int[0];

        List<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] == a2[j]) {

                // this if ensures we dont put duplicates in the intersection.
                // if (intersection.isEmpty() || intersection.get(intersection.size() - 1) !=
                // a1[i]) {
                // intersection.add(a1[i]);
                // }

                intersection.add(a1[i]); // allows for duplicates
                i++;
                j++;
            } else {
                if (a1[i] < a2[j]) {
                    i++;
                } else {
                    j++;
                }
            }
        }
        return intersection.stream().mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {
        int[] a1 = { 1, 2, 3, 3, 4, 5, 8, 9 };
        int[] a2 = { 2, 3, 3, 4, 6, 7, 8 };
        int[] I = intersection(a1, a2);
        for (int i : I) {
            System.out.print(i + " ");
        }
    }
}
