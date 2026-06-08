package step3_arrays.lec_2_medium;

public class SpiralTraversalOfMatrix {
    static void spiralTraversal(int[][] arr) {
        // Dynamically handle non-square matrices
        int rows = arr.length;
        int cols = arr[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // 1. Walk Right
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // 2. Walk Down
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Ensure there are still rows left to process before walking left
            if (top <= bottom) {
                // 3. Walk Left
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Ensure there are still columns left to process before walking up
            if (left <= right) {
                // 4. Walk Up
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14,
                15, 16 } };
        spiralTraversal(arr);
    }
}
