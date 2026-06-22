package step3_arrays.lec_3_hard;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    private static List<Integer> generateRow(int rowNumber) {
        List<Integer> row = new ArrayList<>();

        long value = 1;
        row.add(1);

        for (int col = 1; col < rowNumber; col++) {
            value = value * (rowNumber - col);
            value = value / col;
            row.add((int) value);
        }

        return row;
    }

    private static void printPascalTriangle(int totalRows) {
        for (int row = 1; row <= totalRows; row++) {
            System.out.println(generateRow(row));
        }
    }

    private static List<List<Integer>> generatePascalTriangle(int totalRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int row = 1; row <= totalRows; row++) {
            triangle.add(generateRow(row));
        }

        return triangle;
    }

    public static void main(String[] args) {
        int totalRows = 5;

        List<List<Integer>> triangle = generatePascalTriangle(totalRows);

        System.out.println("Pascal's Triangle:");
        System.out.println(triangle);

        // Alternative printing
        // printPascalTriangle(totalRows);
    }
}