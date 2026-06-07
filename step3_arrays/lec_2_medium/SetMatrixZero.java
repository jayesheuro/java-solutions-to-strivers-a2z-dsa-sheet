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

    static void setMatrixZeroOptimal(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // This single variable resolves the arr[0][0] collision
        int col0 = 1;

        // STEP 1: Traverse the matrix and take notes in the first row & col
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    // Mark the i-th row
                    arr[i][0] = 0;

                    // Mark the j-th column
                    if (j == 0) {
                        col0 = 0; // Use our special variable for the first column
                    } else {
                        arr[0][j] = 0; // Use the first row for the rest of the columns
                    }
                }
            }
        }

        // STEP 2: Update the inner matrix using our notes
        // Start loops at 1 to completely ignore the first row and col
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                // If either the row marker OR column marker is 0, change it
                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // STEP 3: Handle the First Row
        // The first row's destiny is stored at arr[0][0]
        if (arr[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                arr[0][j] = 0;
            }
        }

        // STEP 4: Handle the First Column
        // The first column's destiny is stored in our special variable col0
        if (col0 == 0) {
            for (int i = 0; i < rows; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        System.out.println("Before setting zeroes");
        printMatrix(arr);

        setMatrixZeroOptimal(arr);
        System.out.println("After setting zeroes");
        printMatrix(arr);
    }
}
