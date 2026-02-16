import java.util.Scanner;

public class MatrixColumn {
    public static void main(String args[]) {
        int[][] matrix = {
                {6, 5, 9, 7, 8},
                {6, 7, 1, 4, 9},
                {2, 2, 4, 3, 7}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int firstColumnSum = 0;
        for (int i = 0; i < rows; i++) {
            firstColumnSum += matrix[i][0];
        }
        boolean allEqual = true;

        for (int j = 1; j < cols; j++) {
            int columnSum = 0;

            for (int i = 0; i < rows; i++) {
                columnSum += matrix[i][j];
            }

            if (columnSum != firstColumnSum) {
                allEqual = false;
                break;
            }
        }

        if (allEqual) {
            System.out.println("All column sums are equal.");
        } else {
            System.out.println("Column sums are NOT equal.");
        }
    }
}
