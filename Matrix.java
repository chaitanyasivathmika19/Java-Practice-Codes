import java.util.Scanner;

public class Matrix{
    public static void main(String[] args) {

        // --- dimensions ----------------------------------------------------
        final int ROWS = 2;
        final int COLS = 3;
        int[][] matrix = new int[ROWS][COLS];

        // --- read elements -------------------------------------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + (ROWS * COLS) + " integers:");

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // --- display the matrix -------------------------------------------
        System.out.println("\nYou entered:");
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
