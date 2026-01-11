public class SpiralMatrix {

    public static void printSpiralMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // Left → Right
            for (int col = left; col <= right; col++) {
                System.out.print(matrix[top][col] + " ");
            }
            top++;

            // Top → Bottom
            for (int row = top; row <= bottom; row++) {
                System.out.print(matrix[row][right] + " ");
            }
            right--;

            // Right → Left
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    System.out.print(matrix[bottom][col] + " ");
                }
                bottom--;
            }

            // Bottom → Top
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    System.out.print(matrix[row][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test Case 1: Square Matrix
        int[][] matrix1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Square Matrix:");
        printSpiralMatrix(matrix1);

        // Test Case 2: Rectangular Matrix (More Columns)
        int[][] matrix2 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println("Rectangular Matrix (3x4):");
        printSpiralMatrix(matrix2);

        // Test Case 3: Single Row
        int[][] matrix3 = {
                { 1, 2, 3, 4, 5 }
        };
        System.out.println("Single Row Matrix:");
        printSpiralMatrix(matrix3);

        // Test Case 4: Single Column
        int[][] matrix4 = {
                { 1 },
                { 2 },
                { 3 },
                { 4 }
        };
        System.out.println("Single Column Matrix:");
        printSpiralMatrix(matrix4);
    }
}
