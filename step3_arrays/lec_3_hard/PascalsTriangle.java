package step3_arrays.lec_3_hard;

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

    public static void main(String[] args) {
        int n = 5;
        printPascalTriangle(n);
    }
}
