import java.util.*;

public class Spiral_Matrix {
    public static void demo(int arr[][]) {
        int si_row = 0;
        int si_col = 0;
        int ei_row = arr.length - 1;
        int ei_col = arr[0].length - 1; // Corrected the column limit

        while (si_row <= ei_row && si_col <= ei_col) {
            // top
            for (int j = si_col; j <= ei_col; j++) {
                System.out.print(arr[si_row][j] + " ");
            }

            // right
            for (int i = si_row + 1; i <= ei_row; i++) {
                System.out.print(arr[i][ei_col] + " ");
            }

            // bottom
            if (si_row < ei_row) { // Check if there's more than one row
                for (int j = ei_col - 1; j >= si_col; j--) {
                    System.out.print(arr[ei_row][j] + " ");
                }
            }

            // left
            if (si_col < ei_col) { // Check if there's more than one column
                for (int i = ei_row - 1; i > si_row; i--) {
                    System.out.print(arr[i][si_col] + " ");
                }
            }

            si_row++;
            si_col++;
            ei_row--;
            ei_col--;
        }
    }

    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        demo(arr);
    }
}
