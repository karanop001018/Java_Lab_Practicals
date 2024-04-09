//Q. Write a program that generate 6*6 two-dimensional matrix, filled
//        with 0’s and 1’s , display the matrix, check every raw and column
//        have an odd number’s of 1’s.

package Lab_Practicals;
import java.util.*;
public class practical_17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        Random rand = new Random();

        // Fill the matrix with 0's and 1's
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = rand.nextInt(2);
            }
        }

        // Display the matrix
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Check if every row and column have an odd number of 1's
        for (int i = 0; i < 6; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 6; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum % 2 == 0) {
                System.out.println("Row " + (i + 1) + " does not have an odd number of 1's.");
            }
            if (colSum % 2 == 0) {
                System.out.println("Column " + (i + 1) + " does not have an odd number of 1's.");

            }
        }
    }
}
