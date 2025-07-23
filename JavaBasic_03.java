public class JavaBasic_03 {

//     Write a program to accept and display 3 by 3 matrix. Use enhanced for loop for display.
// a. Find the transpose of a matrix and print the transpose.
// b. Accept another matrix of same dimensions. Find the addition of two matrices and print the
// resultant matrix.
    public static void main(String[] args) {
        // Input: First 3x3 Matrix
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Input: Second 3x3 Matrix
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Display Matrix 1 using enhanced for loop
        System.out.println("Matrix 1:");
        for (int[] row : matrix1) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Find transpose of matrix1
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix1[i][j];
            }
        }

        // Display Transpose
        System.out.println("\nTranspose of Matrix 1:");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        // Matrix addition
        int[][] sum = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display Sum
        System.out.println("\nSum of Matrix 1 and Matrix 2:");
        for (int[] row : sum) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
