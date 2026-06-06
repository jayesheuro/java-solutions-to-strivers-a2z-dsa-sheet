package step3_arrays.lec_2_medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixZero {
    static void printMatrix(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setMatrixZero(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowSet.contains(i) || colSet.contains(j)) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        System.out.println("Before setting zeroes");
        printMatrix(arr);

        setMatrixZero(arr);
        System.out.println("After setting zeroes");
        printMatrix(arr);
    }
}
