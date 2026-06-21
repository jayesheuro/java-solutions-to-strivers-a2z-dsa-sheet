package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    static void printRow(int n) {
        int ans = 1;
        System.out.print(1 + " ");
        for (int j = 1; j < n; j++) {
            ans = ans * (n - j);
            ans = ans / j;
            System.out.print(ans + " ");
        }
    }

    static void printPascalTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(i);
            System.out.println();
        }
    }

    static List<Integer> getRow(int n) {
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int j = 1; j < n; j++) {
            ans = ans * (n - j);
            ans = ans / j;
            ansRow.add(ans);
        }
        return ansRow;
    }

    static List<List<Integer>> getPascalTriangleList(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            List<Integer> ansRow = getRow(i);
            ans.add(ansRow);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        // printPascalTriangle(n);
        List<List<Integer>> ans = getPascalTriangleList(n);
        System.out.println(ans);
    }
}
