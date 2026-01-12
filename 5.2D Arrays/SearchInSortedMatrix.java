public class SearchInSortedMatrix {

    // Time Complexity:O(n*m)
    // Space Complexity:O(1)
    public static boolean searchBrute(int matrix[][], int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        searchBrute(arr, 33);
    }
}
