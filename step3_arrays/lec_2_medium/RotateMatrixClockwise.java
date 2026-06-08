package step3_arrays.lec_2_medium;

public class RotateMatrixClockwise {
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

    static void rotateMatrix(int[][] arr, int n) {
        if (n == 0)
            return;

        int[][] ans = new int[n][n];

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                ans[col][n - row - 1] = arr[row][col];
            }
        }

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                arr[row][col] = ans[row][col];
            }
        }

    }

    static void rotateMatrixOptimal(int[][] arr, int n) {
        if (n == 0)
            return;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                int temp = arr[col][row];
                arr[col][row] = arr[row][col];
                arr[row][col] = temp;
            }
        }

        for (int row = 0; row < n; row++) {
            int i = 0;
            int j = n - 1;
            while (i < j) {
                int temp = arr[row][i];
                arr[row][i] = arr[row][j];
                arr[row][j] = temp;
                i++;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = { { 0, 1, 2 }, { 3, 4, 5 }, { 1, 3, 1 } };
        System.out.println("Before rotating");
        printMatrix(arr);

        rotateMatrixOptimal(arr, arr.length);
        System.out.println("After rotating");
        printMatrix(arr);
    }
}
